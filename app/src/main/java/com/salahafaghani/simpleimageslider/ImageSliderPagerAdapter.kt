package com.salahafaghani.simpleimageslider

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.salahafaghani.simpleimageslider.databinding.FragmentImageSliderPageBinding

class ImageSliderPagerAdapter(private val imageUrls: Array<String>) : RecyclerView.Adapter<ImageSliderPagerAdapter.ImageSlidePagerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageSlidePagerViewHolder {
        val binding = FragmentImageSliderPageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageSlidePagerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageSlidePagerViewHolder, position: Int) {
        holder.bind(imageUrls[position])
    }

    override fun getItemCount(): Int {
        return imageUrls.size
    }

    inner class ImageSlidePagerViewHolder(private val binding: FragmentImageSliderPageBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(imageUrl: String) {
            Glide.with(binding.root)
                .load(imageUrl)
                .into(binding.image)
        }
    }
}
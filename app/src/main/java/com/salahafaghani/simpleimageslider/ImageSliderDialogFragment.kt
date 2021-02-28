package com.salahafaghani.simpleimageslider

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.viewpager2.widget.ViewPager2

class ImageSliderDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val pager = LayoutInflater.from(requireContext())
            .inflate(R.layout.fragment_image_slider, ViewPager2(requireContext()), false) as ViewPager2

        pager.adapter = ImageSliderPagerAdapter(arguments?.getStringArray("imageUrls")!!)
        pager.setPageTransformer(ZoomOutPageTransformer())

        return AlertDialog.Builder(requireContext())
            .setView(pager)
            .create()
    }
}
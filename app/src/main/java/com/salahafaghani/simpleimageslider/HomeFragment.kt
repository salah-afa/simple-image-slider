package com.salahafaghani.simpleimageslider

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.salahafaghani.simpleimageslider.databinding.FragmentHomeBinding
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentHomeBinding.bind(view)
        binding.buttonImageSlider.setOnClickListener {
            val action =
                HomeFragmentDirections.actionHomeFragmentToImageSlideDialogFragment(
                    arrayOf(
                        "https://images.freeimages.com/images/small-previews/0ce/pomegranate-1329925.jpg",
                        "https://images.freeimages.com/images/small-previews/362/peppers-1329008.jpg",
                        "https://images.freeimages.com/images/small-previews/b36/tomato-1326722.jpg",
                        "https://images.freeimages.com/images/small-previews/1d3/asparagus-1321200.jpg",
                        "https://images.freeimages.com/images/small-previews/565/orange-slice-backlighted-1330008.jpg"
                    )
                )
            findNavController().navigate(action)
        }
    }
}
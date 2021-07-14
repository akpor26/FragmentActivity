package com.onovughe.fragmentactivity.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.onovughe.fragmentactivity.R
import com.onovughe.fragmentactivity.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
   private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

}
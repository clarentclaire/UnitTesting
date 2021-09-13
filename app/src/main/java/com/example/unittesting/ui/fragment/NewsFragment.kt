package com.example.unittesting.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.unittesting.R
import com.example.unittesting.ui.TestViewModel

class NewsFragment : Fragment(R.layout.fragment_news) {
    lateinit var myModel: TestViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ViewModelProvider(requireActivity()).get(TestViewModel::class.java).also { myModel = it }
    }
}
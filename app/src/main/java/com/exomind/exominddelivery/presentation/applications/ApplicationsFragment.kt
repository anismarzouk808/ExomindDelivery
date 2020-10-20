package com.exomind.exominddelivery.presentation.applications

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.exomind.exominddelivery.R

class ApplicationsFragment : Fragment() {

    companion object {
        fun newInstance() = ApplicationsFragment()
    }

    private lateinit var viewModel: ApplicationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_applications, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ApplicationsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
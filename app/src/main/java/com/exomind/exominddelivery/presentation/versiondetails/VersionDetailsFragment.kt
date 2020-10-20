package com.exomind.exominddelivery.presentation.versiondetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.exomind.exominddelivery.R

class VersionDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = VersionDetailsFragment()
    }

    private lateinit var viewModel: VersionDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_version_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VersionDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
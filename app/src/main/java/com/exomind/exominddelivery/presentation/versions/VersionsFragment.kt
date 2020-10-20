package com.exomind.exominddelivery.presentation.versions

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.exomind.exominddelivery.R

class VersionsFragment : Fragment() {

    companion object {
        fun newInstance() = VersionsFragment()
    }

    private lateinit var viewModel: VersionsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_versions, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VersionsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
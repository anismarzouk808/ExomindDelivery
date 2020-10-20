package com.exomind.exominddelivery.presentation.clients

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.exomind.exominddelivery.R

class ClientsFragment : Fragment() {

    companion object {
        fun newInstance() = ClientsFragment()
    }

    private lateinit var viewModel: ClientsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_client, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ClientsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
package com.kostya_windows.roomdatastoredarkthemeandmore.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.kostya_windows.roomdatastoredarkthemeandmore.R
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment :Fragment(R.layout.fragment_main){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        fab.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_addUserFragment)
        }

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
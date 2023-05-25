package com.airbandme.app.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbandme.app.R
import com.airbandme.app.databinding.FragmentMoreBinding
import com.airbandme.app.ui.AccountInformationActivity
import com.fizall.app.base.BaseFragment


class MoreFragment : BaseFragment() {

    private lateinit var binding: FragmentMoreBinding

    override fun getLayoutId(): Int = R.layout.fragment_more
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clicks()
    }

    fun clicks(){
        binding.accountInfo.setOnClickListener {
            startActivity(Intent(context,AccountInformationActivity::class.java))
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,): View? {
        binding = FragmentMoreBinding.inflate(inflater, container, false)
        return binding.root

    }

}
package com.airbandme.app.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbandme.app.R
import com.airbandme.app.adapters.UsageHistoryAdapter
import com.airbandme.app.databinding.FragmentMoreBinding
import com.airbandme.app.models.UsageHistory
import com.airbandme.app.ui.AccountInformationActivity
import com.airbandme.app.ui.DataUsageActivity
import com.airbandme.app.ui.SettingsActivity
import com.airbandme.app.ui.TransactionRecieptsActivity
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
        binding.settings.setOnClickListener {
            startActivity(Intent(context,SettingsActivity::class.java))
        }
        binding.usageHistory.setOnClickListener {
            startActivity(Intent(context,DataUsageActivity::class.java))
        }
        binding.transactionReciept.setOnClickListener {
            startActivity(Intent(context,TransactionRecieptsActivity::class.java))
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,): View? {
        binding = FragmentMoreBinding.inflate(inflater, container, false)
        return binding.root

    }

}
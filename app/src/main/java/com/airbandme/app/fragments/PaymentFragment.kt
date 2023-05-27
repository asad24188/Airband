package com.airbandme.app.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbandme.app.R
import com.airbandme.app.databinding.FragmentMoreBinding
import com.airbandme.app.databinding.FragmentPaymentBinding
import com.airbandme.app.ui.AccountInformationActivity
import com.airbandme.app.ui.RenewPlanActivity
import com.airbandme.app.ui.SettingsActivity
import com.fizall.app.base.BaseFragment


class PaymentFragment : BaseFragment() {

    private lateinit var binding : FragmentPaymentBinding
    override fun getLayoutId(): Int = R.layout.fragment_payment
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clicks()
    }

    fun clicks(){
        binding.renew.setOnClickListener {
            startActivity(Intent(context, RenewPlanActivity::class.java))
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPaymentBinding.inflate(inflater, container, false)
        return binding.root
    }
}
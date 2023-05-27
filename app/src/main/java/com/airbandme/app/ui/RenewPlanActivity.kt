package com.airbandme.app.ui

import android.os.Bundle
import com.airbandme.app.R
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.bottomsheets.PaymentMethodsFragment
import com.airbandme.app.databinding.ActivityRenewPlanBinding

class RenewPlanActivity : BaseActivity() {

    lateinit var binding: ActivityRenewPlanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRenewPlanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener { finish() }
        binding.pay.setOnClickListener {
            val bottomSheetDialogFragment = PaymentMethodsFragment()
            bottomSheetDialogFragment.show(supportFragmentManager, "TAG")
        }

    }
}
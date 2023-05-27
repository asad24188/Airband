package com.airbandme.app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.R
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.bottomsheets.CheckoutBottomSheet
import com.airbandme.app.bottomsheets.PaymentMethodsFragment
import com.airbandme.app.databinding.ActivityPaymentSummaryBinding
import com.airbandme.app.databinding.ActivityRenewPlanBinding

class PaymentSummaryActivity : BaseActivity() {


    lateinit var binding: ActivityPaymentSummaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentSummaryBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.payButton.setOnClickListener {
            val bottomSheetDialogFragment = CheckoutBottomSheet()
            bottomSheetDialogFragment.show(supportFragmentManager, "TAG")
        }

    }
}
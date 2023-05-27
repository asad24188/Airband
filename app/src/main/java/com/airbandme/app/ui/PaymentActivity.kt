package com.airbandme.app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.R
import com.airbandme.app.bottomsheets.PaymentSuccessfullBottomSheet
import com.airbandme.app.bottomsheets.SuccessDialogFragment
import com.airbandme.app.databinding.ActivityPaymentBinding
import com.airbandme.app.databinding.ActivityPaymentSummaryBinding

class PaymentActivity : AppCompatActivity() {

    lateinit var binding: ActivityPaymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.payButton.setOnClickListener {
            val bottomSheetDialogFragment = PaymentSuccessfullBottomSheet()
            bottomSheetDialogFragment.show(supportFragmentManager, "TAG")
        }
    }
}
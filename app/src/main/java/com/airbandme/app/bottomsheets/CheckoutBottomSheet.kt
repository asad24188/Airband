package com.airbandme.app.bottomsheets

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbandme.app.R
import com.airbandme.app.databinding.FragmentCheckoutBottomSheetBinding
import com.airbandme.app.databinding.FragmentPaymentMethodsBinding
import com.airbandme.app.ui.PaymentActivity
import com.airbandme.app.ui.PaymentSummaryActivity
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class CheckoutBottomSheet : BottomSheetDialogFragment() {

    lateinit var binding: FragmentCheckoutBottomSheetBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clicks()

    }

    private fun clicks() {
        binding.payWithCard.setOnClickListener {
            startActivity(Intent(context, PaymentActivity::class.java))
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCheckoutBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

}
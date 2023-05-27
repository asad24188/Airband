package com.airbandme.app.bottomsheets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbandme.app.R
import com.airbandme.app.databinding.FragmentCheckoutBottomSheetBinding
import com.airbandme.app.databinding.FragmentPaymentMethodsBinding
import com.airbandme.app.databinding.FragmentPaymentSuccessfullBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class PaymentSuccessfullBottomSheet : BottomSheetDialogFragment() {

    lateinit var binding: FragmentPaymentSuccessfullBottomSheetBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clicks()
    }

    fun clicks(){
        binding.close.setOnClickListener { dismiss() }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPaymentSuccessfullBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

}
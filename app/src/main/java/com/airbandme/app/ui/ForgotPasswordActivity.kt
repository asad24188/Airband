package com.airbandme.app.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : BaseActivity() {

    lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initt()
        clicks()
    }

    private fun clicks() {
        binding.tvSendCode.setOnClickListener {
            sendCode()
        }
        binding.ivBack.setOnClickListener { finish() }
        binding.tvLogin.setOnClickListener { finish() }
    }

    private fun sendCode() {
        var email = binding.etEmail.text.toString()
        if (email.isNotEmpty()){
            startActivity(Intent(context, OtpVerificationActivity::class.java))
        }else{
            showToast("Invalid Email!")
        }
    }

    private fun initt() {

    }
}
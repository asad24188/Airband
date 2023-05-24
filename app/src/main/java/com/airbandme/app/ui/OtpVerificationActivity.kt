package com.airbandme.app.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.auth.CreatePasswordActivity
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.databinding.ActivityOtpVerificationBinding

class OtpVerificationActivity : BaseActivity() {

    lateinit var binding: ActivityOtpVerificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initt()
        clicks()
    }

    private fun clicks() {
        binding.ivBack.setOnClickListener { finish() }
        binding.tvVerify.setOnClickListener {
            verifyOtp()
        }
    }

    private fun verifyOtp() {
        startActivity(Intent(context, CreatePasswordActivity::class.java))
    }

    private fun initt() {}
}
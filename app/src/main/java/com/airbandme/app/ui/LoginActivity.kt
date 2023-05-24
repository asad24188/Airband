package com.airbandme.app.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.databinding.ActivityLoginBinding
import com.airbandme.app.ui.auth.ForgotPasswordActivity
import com.airbandme.app.ui.auth.RegisterActivity

class LoginActivity : BaseActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initt()
        clicks()
    }

    private fun initt() {}

    private fun clicks() {
        binding.tvForgotPassword.setOnClickListener { startActivity(Intent(context,ForgotPasswordActivity::class.java)) }
        binding.tvRegister.setOnClickListener { startActivity(Intent(context,RegisterActivity::class.java)) }

    }
}
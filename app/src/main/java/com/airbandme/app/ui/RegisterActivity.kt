package com.airbandme.app.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.databinding.ActivityRegisterBinding
import com.airbandme.app.ui.LoginActivity

class RegisterActivity : BaseActivity() {

    lateinit var binding : ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initt()
        clicks()

    }

    private fun clicks() {
        binding.ivBack.setOnClickListener { finish() }
        binding.tvRegister.setOnClickListener { startActivity(Intent(context, LoginActivity::class.java)) }
    }

    private fun initt() {}
}
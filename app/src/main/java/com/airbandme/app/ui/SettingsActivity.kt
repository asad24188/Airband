package com.airbandme.app.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.R
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.databinding.ActivitySettingsBinding
import com.airbandme.app.databinding.ActivitySplashBinding

class SettingsActivity : BaseActivity() {

    lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clicks()
    }

    private fun clicks() {

        binding.ivBack.setOnClickListener { finish() }
        binding.changePassword.setOnClickListener {
            startActivity(Intent(context,ChangePasswordActivity::class.java))
        }
    }
}
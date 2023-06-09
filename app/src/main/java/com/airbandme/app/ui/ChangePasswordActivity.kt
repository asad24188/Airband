package com.airbandme.app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.R
import com.airbandme.app.databinding.ActivityChangePasswordBinding
import com.airbandme.app.databinding.ActivitySettingsBinding


class ChangePasswordActivity : BaseActivity() {

    lateinit var binding: ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clicks()
    }

    private fun clicks() {

        binding.ivBack.setOnClickListener { finish() }
    }
}
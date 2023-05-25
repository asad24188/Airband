package com.airbandme.app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.R
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.databinding.ActivityAccountInformationBinding
import com.airbandme.app.databinding.ActivityAccountNameBinding

class AccountNameActivity : BaseActivity() {

    lateinit var binding: ActivityAccountNameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener { finish() }

    }
}
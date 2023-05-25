package com.airbandme.app.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.R
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.databinding.ActivityAccountInformationBinding
import com.airbandme.app.databinding.ActivityCreatePasswordBinding

class AccountInformationActivity : BaseActivity() {

    lateinit var binding: ActivityAccountInformationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nameLayout.setOnClickListener {
            startActivity(Intent(context,AccountNameActivity::class.java))
        }
        binding.addressLayout.setOnClickListener {
            startActivity(Intent(context,AddressActivity::class.java))
        }
        binding.changeEmailLayout.setOnClickListener {
            startActivity(Intent(context,EmailActivity::class.java))
        }
        binding.mobileLayout.setOnClickListener {
            startActivity(Intent(context,MobileNumberActivity::class.java))
        }
        binding.ivBack.setOnClickListener { finish() }

    }
}
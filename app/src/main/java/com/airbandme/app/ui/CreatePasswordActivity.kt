package com.airbandme.app.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.databinding.ActivityCreatePasswordBinding
import com.airbandme.app.ui.auth.PasswordChangedActivity

class CreatePasswordActivity : BaseActivity() {

    lateinit var binding: ActivityCreatePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreatePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initt()
        clicks()
    }

    private fun clicks() {
        binding.ivBack.setOnClickListener { finish() }
        binding.tvReset.setOnClickListener { startActivity(Intent(context, PasswordChangedActivity::class.java)) }

    }

    private fun initt() {}
}
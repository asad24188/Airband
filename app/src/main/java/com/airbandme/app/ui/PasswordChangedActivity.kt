package com.airbandme.app.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.databinding.ActivityPasswordChangedBinding
import com.airbandme.app.ui.LoginActivity


class PasswordChangedActivity : BaseActivity() {

    lateinit var binding: ActivityPasswordChangedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasswordChangedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initt()
        clicks()

    }

    private fun clicks() {
        binding.tvBackToLogin.setOnClickListener {
           goToLogin()
        }
    }

    private fun initt() {}


    override fun onBackPressed() {
        super.onBackPressed()
        goToLogin()

    }

    private fun goToLogin() {
        startActivity(Intent(context, LoginActivity::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        )
    }
}
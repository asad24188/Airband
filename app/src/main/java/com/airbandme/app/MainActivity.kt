package com.airbandme.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.databinding.ActivityForgotPasswordBinding
import com.airbandme.app.databinding.ActivityLoginBinding
import com.airbandme.app.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
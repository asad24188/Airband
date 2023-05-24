package com.airbandme.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.databinding.ActivityForgotPasswordBinding
import com.airbandme.app.databinding.ActivityLoginBinding
import com.airbandme.app.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottmnaNavigation)
        val navController = findNavController(R.id.fragment)

        bottomNavigation.setupWithNavController(navController)
    }
}
package com.airbandme.app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbandme.app.R
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.databinding.ActivityTransactionDetailBinding
import com.airbandme.app.databinding.ActivityTransactionRecieptsBinding

class TransactionDetailActivity : BaseActivity() {

    lateinit var binding: ActivityTransactionDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransactionDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener { finish() }
    }
}
package com.airbandme.app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbandme.app.adapters.TransactionRecieptsAdapter
import com.airbandme.app.adapters.UsageHistoryAdapter
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.bottomsheets.FilterDialogFragment
import com.airbandme.app.databinding.ActivityDataUsageBinding
import com.airbandme.app.databinding.ActivityTransactionRecieptsBinding
import com.airbandme.app.models.Transaction
import com.airbandme.app.models.UsageHistory

class TransactionRecieptsActivity : BaseActivity() {

    lateinit var binding: ActivityTransactionRecieptsBinding
    private var adapter: TransactionRecieptsAdapter? = null
    lateinit var list: ArrayList<Transaction>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransactionRecieptsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initt()
        clicks()
        setData()
        setAdapter()

    }

    private fun clicks() {
        binding.ivBack.setOnClickListener { finish() }
        binding.ivFilter.setOnClickListener {
            val bottomSheetDialogFragment = FilterDialogFragment()
            bottomSheetDialogFragment.show(supportFragmentManager, "TAG")
        }
    }

    private fun initt() {
        list = ArrayList()
    }

    private fun setData() {

        for (i in 0 .. 10){
            val data = Transaction("Test Transaction","12/09/ 2022   4:20PM","N41,500. 00")
            list.add(data)
        }
    }

    private fun setAdapter() {

        binding.rvUsage.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        adapter = TransactionRecieptsAdapter(context, list)
        binding.rvUsage.setAdapter(adapter)
    }
}
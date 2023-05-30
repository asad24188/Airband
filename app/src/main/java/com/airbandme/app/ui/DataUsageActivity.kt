package com.airbandme.app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbandme.app.R
import com.airbandme.app.adapters.PlansAdapter
import com.airbandme.app.adapters.UsageHistoryAdapter
import com.airbandme.app.base.BaseActivity
import com.airbandme.app.bottomsheets.FilterDialogFragment
import com.airbandme.app.bottomsheets.SuccessDialogFragment
import com.airbandme.app.databinding.ActivityChangePasswordBinding
import com.airbandme.app.databinding.ActivityDataUsageBinding
import com.airbandme.app.models.Plan
import com.airbandme.app.models.UsageHistory

class DataUsageActivity : BaseActivity() {

    lateinit var binding: ActivityDataUsageBinding
    private var adapter: UsageHistoryAdapter? = null
    lateinit var list: ArrayList<UsageHistory>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataUsageBinding.inflate(layoutInflater)
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

        for (i in 0 .. 5){
            val usageHistory = UsageHistory("25 Sep 2022","15.5 GB","12.2 GB")
            list.add(usageHistory)
        }
    }

    private fun setAdapter() {

        binding.rvUsage.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        adapter = UsageHistoryAdapter(context, list)
        binding.rvUsage.setAdapter(adapter)
    }
}
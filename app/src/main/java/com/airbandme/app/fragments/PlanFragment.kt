package com.airbandme.app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbandme.app.R
import com.airbandme.app.adapters.PlansAdapter
import com.airbandme.app.bottomsheets.SuccessDialogFragment
import com.airbandme.app.databinding.FragmentPlanBinding
import com.airbandme.app.models.Plan
import com.fizall.app.base.BaseFragment


class PlanFragment : BaseFragment() {

    private lateinit var binding: FragmentPlanBinding
    private var adapter: PlansAdapter? = null
    lateinit var list: ArrayList<Plan>


    override fun getLayoutId(): Int = R.layout.fragment_plan

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initt()
        setData()
        clicks()
        setAdapter()
    }

    private fun setData() {

        for (i in 0 .. 5){
            val plan = Plan("SmartHome Lite","Unlimited Download Speed,\nUpto 43/43Mbps, 24 hours.","NGN 21,454.00 / month")
            list.add(plan)
        }
    }

    private fun setAdapter() {

        binding.recycler!!.setLayoutManager(LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false))
        adapter = PlansAdapter(requireContext(), list)
        binding.recycler!!.setAdapter(adapter)
    }

    private fun initt() {

        list = ArrayList()
    }

    private fun clicks() {
        binding.changePlan.setOnClickListener {
            val bottomSheetDialogFragment = SuccessDialogFragment()
            bottomSheetDialogFragment.show(requireActivity().supportFragmentManager, "TAG")
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        binding = FragmentPlanBinding.inflate(inflater, container, false)
        return binding.root
    }

}
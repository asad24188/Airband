package com.airbandme.app.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbandme.app.R
import com.airbandme.app.models.Plan
import com.airbandme.app.models.Transaction
import com.airbandme.app.models.UsageHistory
import com.airbandme.app.ui.TransactionDetailActivity
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class TransactionRecieptsAdapter(val context: Context, val list: ArrayList<Transaction>) :
    RecyclerView.Adapter<TransactionRecieptsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val name: TextView = itemView.findViewById(R.id.planName)
        val dateAndTime: TextView = itemView.findViewById(R.id.dateAndTime)
        val planPrice: TextView = itemView.findViewById(R.id.planPrice)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.transaction_reciept_adapter_layout, parent, false)
        return TransactionRecieptsAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = list.get(position)
        holder.name.text = model.name
        holder.dateAndTime.text = model.date_and_time
        holder.planPrice.text = model.price
        holder.itemView.setOnClickListener { context.startActivity(Intent(context,TransactionDetailActivity::class.java)) }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
package com.airbandme.app.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbandme.app.R
import com.airbandme.app.models.Plan
import com.airbandme.app.models.UsageHistory
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class UsageHistoryAdapter(val context: Context, val list: ArrayList<UsageHistory>) :
    RecyclerView.Adapter<UsageHistoryAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val date: TextView = itemView.findViewById(R.id.date)
        val uploads: TextView = itemView.findViewById(R.id.uploads)
        val downloads: TextView = itemView.findViewById(R.id.downloads)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.data_usage_adapter_layout, parent, false)
        return UsageHistoryAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = list.get(position)
        holder.date.text = model.date
        holder.uploads.text = model.uploads
        holder.downloads.text = model.downloads
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
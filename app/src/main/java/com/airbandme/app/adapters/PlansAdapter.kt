package com.airbandme.app.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbandme.app.R
import com.airbandme.app.models.Plan
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class PlansAdapter(val context: Context, val list: ArrayList<Plan>) :
    RecyclerView.Adapter<PlansAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title: TextView = itemView.findViewById(R.id.planTitle)
        val description: TextView = itemView.findViewById(R.id.planDetail)
        val price: TextView = itemView.findViewById(R.id.planPrice)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_plan_adapter_layout, parent, false)
        return PlansAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = list.get(position)
        holder.title.text = model.title
        holder.description.text = model.description
        holder.price.text = model.price
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
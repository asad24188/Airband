package com.fizall.app.base

import android.Manifest
import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.airbandme.app.utils.Utilities
import java.text.SimpleDateFormat
import java.util.*

abstract class BaseFragment : Fragment() {

    abstract fun getLayoutId(): Int

    lateinit var dialog: ProgressDialog
    lateinit var utilities: Utilities

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (!::utilities.isInitialized) { utilities = Utilities(context!!) }

    }

    fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun showToast(resId: Int) {
        Toast.makeText(context, resId, Toast.LENGTH_SHORT).show()
    }

    fun showLog(message: String) {
        Log.d("MTAG",message)
    }

    fun showProgressDialog(show: Boolean) {
        if (show) {
            if (!dialog.isShowing)
                dialog.apply {
                    show()
                }
        } else if (!show) {
            if (dialog.isShowing)
                dialog.dismiss()
        }
    }

    fun getCurrentDate(): String{
        val calToday: Calendar = Calendar.getInstance()
        calToday.add(Calendar.DAY_OF_MONTH, 0)
        val result: Date = calToday.time
        val sdf = SimpleDateFormat("yyyy-MM-dd")
        val date = sdf.format(result)
        return date
    }


}
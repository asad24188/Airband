package com.airbandme.app.base

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.media.Ringtone
import android.os.Build
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.airbandme.app.R
import com.airbandme.app.utils.Utilities

import java.text.SimpleDateFormat
import java.util.*

abstract class BaseActivity : AppCompatActivity() {

    lateinit var utilities: Utilities
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        context = this
        if (!::utilities.isInitialized) utilities = Utilities(this)
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun showToast(resId: Int) {
        Toast.makeText(this, resId, Toast.LENGTH_LONG).show()
    }

    fun showLog(value: String) {
        Log.d("MTAG",value)
    }

    fun showAlertDialog(title: String, message: String, callback: DialogInterface.OnClickListener) {

        val dialog: AlertDialog.Builder = AlertDialog.Builder(this)
        dialog.setTitle(title)
        dialog.setMessage(message)
        dialog.setPositiveButton(getString(R.string.OK), callback)
        dialog.setNegativeButton(getString(R.string.CANCEL)) { dialogInterface: DialogInterface, _: Int ->
            dialogInterface.dismiss()
        }
        dialog.setCancelable(false)
        dialog.show()
    }

    fun logout() {
        val dialog: AlertDialog.Builder = AlertDialog.Builder(this)
        dialog.setTitle(getString(R.string.LOGOUT))
        dialog.setMessage(getString(R.string.LOGOUT_ALERT_MESSAGE))
        dialog.setPositiveButton(getString(R.string.YES)) { _: DialogInterface, _: Int ->
            utilities.clearSharedPref(context = this)
        }
        dialog.setNegativeButton(getString(R.string.NO)) { dialogInterface: DialogInterface, _: Int ->
            dialogInterface.dismiss()
        }
        dialog.setCancelable(false)
        dialog.show()
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
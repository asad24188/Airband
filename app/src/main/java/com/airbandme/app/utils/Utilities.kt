package com.airbandme.app.utils

import android.app.Activity
import android.app.ProgressDialog
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Build
import android.text.TextUtils
import android.util.Base64
import android.util.Log
import android.util.Patterns
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.airbandme.app.responseModels.signup.User
import com.airbandme.app.utils.Constants.SHAREDPREFERENCE_NAME
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class Utilities(context: Context) {

    private val context: Context? = null
    var dialog: ProgressDialog? = null

    fun showProgressDialog(ctx: Context?, msg: String?) {
        dialog = ProgressDialog(ctx)
        dialog!!.setProgressStyle(ProgressDialog.STYLE_SPINNER)
        dialog!!.setMessage(msg)
        dialog!!.setIndeterminate(true)
        dialog!!.setCanceledOnTouchOutside(false)
        dialog!!.show()
    }

    fun hideProgressDialog() {
        if (dialog != null && dialog!!.isShowing()) {
            dialog!!.cancel()
            dialog = null
        }
    }

    fun showToast(resId: String,context: Context?) {
        Toast.makeText(context, resId, Toast.LENGTH_SHORT).show()
    }

    fun saveInt(context: Context, key: String?, value: Int) {
        val sharedPreferences = context.getSharedPreferences(SHAREDPREFERENCE_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putInt(key, value)
        editor.apply() }

    fun getInt(context: Context, key: String?): Int {
        val sharedPreferences = context.getSharedPreferences(SHAREDPREFERENCE_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getInt(key, 0) }

    fun saveString(context: Context, key: String, value: String) {
        val sharedPreferences = context.getSharedPreferences(SHAREDPREFERENCE_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.apply() }

    fun getString(context: Context, key: String): String {
        val sharedPreferences = context.getSharedPreferences(SHAREDPREFERENCE_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getString(key, "").toString() }

    fun clearSharedPref(context: Context) {
        val sharedPreferences = context.getSharedPreferences(SHAREDPREFERENCE_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply() }

    // will be use un facebook login
    fun printHashKey(Context: Context) {
        try {
            val info = Context.packageManager.getPackageInfo(
                Context.packageName,
                PackageManager.GET_SIGNATURES
            )
            for (signature in info.signatures) {
                val md: MessageDigest = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                val hashKey: String = String(Base64.encode(md.digest(), 0))
                Log.i(ContentValues.TAG, "printHashKey() Hash Key: $hashKey")
            }
        } catch (e: NoSuchAlgorithmException) {
            Log.e(ContentValues.TAG, "printHashKey()", e)
        } catch (e: Exception) {
            Log.e(ContentValues.TAG, "printHashKey()", e)
        }
    }

    fun saveBoolean(
        context: Context, key: String, value: Boolean
    ) {
        val sharedPref = context.getSharedPreferences(SHAREDPREFERENCE_NAME, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean(key, value)
        editor.apply()
    }

    fun getBoolean(context: Context, key: String): String {
        val sharedPref = context.getSharedPreferences(SHAREDPREFERENCE_NAME, Context.MODE_PRIVATE)
        return sharedPref.getBoolean(key, false).toString()
    }

    fun setWhiteBars(activity: Activity) {
        val window = activity.window
        val view = window.decorView
        view.systemUiVisibility = view.systemUiVisibility or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        view.systemUiVisibility =
            view.systemUiVisibility or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
        window.navigationBarColor = activity.resources.getColor(android.R.color.white)
        window.statusBarColor = activity.resources.getColor(android.R.color.white)
    }


    fun hideSoftKeyboard(activity: Activity) {
        val inputMethodManager: InputMethodManager =
            activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(activity.currentFocus!!.windowToken, 0)
    }

    fun setWindowFlag(activity: Activity) {
        val win = activity.window
        val winParams = win.attributes
        winParams.flags =
            winParams.flags and WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS.inv()
        win.attributes = winParams
    }
    

    fun isValidEmail(target: CharSequence?): Boolean {
        return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target!!).matches()
    }

    fun getUserId(context: Context): String {
        val sharedPref = context.getSharedPreferences(SHAREDPREFERENCE_NAME, Context.MODE_PRIVATE)
        val gsonn = Gson()
        val myUser = gsonn.fromJson(sharedPref.getString("user", "").toString(), User::class.java)
        val id = myUser.id.toString()
        return id
    }

    fun isValidPassword(password: String): Boolean {
        if (password.length < 8) return false
        if (password.filter { it.isDigit() }.firstOrNull() == null) return false
        if (password.filter { it.isLetter() }.filter { it.isUpperCase() }.firstOrNull() == null) return false
        if (password.filter { it.isLetter() }.filter { it.isLowerCase() }.firstOrNull() == null) return false
        if (password.filter { !it.isLetterOrDigit() }.firstOrNull() == null) return false

        return true
    }


}
package com.pmob.pencarianrs

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_maps.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {
    private var txt_profile_name: TextView? = null  
    private var btn_logout: Button? = null
    private lateinit var sharedpreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_profile_name = findViewById(R.id.txt_profile_name)
        sharedpreferences = getSharedPreferences(
            LoginActivity.my_shared_preferences, MODE_PRIVATE)
        val editor = sharedpreferences.edit()

        txt_profile_name!!.text  = "Hallo " + sharedpreferences.getString(LoginActivity.TAG_NAME, "Testing")

        supportActionBar?.elevation = 0F
        cvRute.setOnClickListener {
            intent = Intent(this@MainActivity, MapsActivity::class.java)
            finish()
            startActivity(intent)
        }
        //   tv_toolbar_title.text = "Pencarian Rumah Sakit"



    }

    private fun logout() {
        sharedpreferences = getSharedPreferences(
                LoginActivity.my_shared_preferences, MODE_PRIVATE)
        val editor = sharedpreferences.edit()
        editor.putBoolean(LoginActivity.session_status, false)
        editor.putString(LoginActivity.TAG_ID, null)
        editor.putString(LoginActivity.TAG_EMAIL, null)
        editor.putString(LoginActivity.TAG_NAME, "Testing")
        editor.putString(LoginActivity.TAG_PHONE, null)
        editor.apply()
        intent = Intent(this@MainActivity, LoginActivity::class.java)
        finish()
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here.
        val id = item.getItemId()


        if (id == R.id.action_two) {
            logout()
            Toast.makeText(this, "Thankyouu", Toast.LENGTH_LONG).show()
            return true
        }


        return super.onOptionsItemSelected(item)

    }
}

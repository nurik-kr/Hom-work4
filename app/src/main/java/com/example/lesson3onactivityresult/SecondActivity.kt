package com.example.lesson3onactivityresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView



class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvETinfo = findViewById<TextView>(R.id.tvETinfo)
        val tvCHinfo = findViewById<TextView>(R.id.tvCHinfo)
        val etBtChange = findViewById<EditText>(R.id.etBtChange)
        val btChange = findViewById<Button>(R.id.btChange)

        btChange.setOnClickListener {
            val intent = Intent()
            intent.putExtra("newButtonText",etBtChange.text.toString())

            setResult(Activity.RESULT_OK,intent)
            finish()
        }

        val etData = intent.getStringExtra("etInfo")
        val chData = intent.getBooleanExtra("chInfo", false)

        tvETinfo.text = etData

        if (chData) {
            tvCHinfo.text = "GOTOV"
        } else {
            tvCHinfo.text = "NE GOTOV"
        }
    }
}
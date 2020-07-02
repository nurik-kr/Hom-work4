package com.example.lesson3onactivityresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    var btGo: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etText = findViewById<EditText>(R.id.etText)
        val chBox = findViewById<CheckBox>(R.id.chBox)
        btGo = findViewById(R.id.btGo)

        btGo?.setOnClickListener {
           val etInfo = etText.text.toString()
            val chInfo = chBox.isChecked

        val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("etInfo",etInfo)
            intent.putExtra("chInfo",chInfo)

       //     startActivity(intent)
            startActivityForResult(intent,1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    if (requestCode == 1 && resultCode == Activity.RESULT_OK){
        val textButton = data?.getStringExtra("newButtonText")
        btGo?.text = textButton
    }
    }
}
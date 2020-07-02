package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val trueLogin = "nurik"
    val trueparol = "12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login:EditText = findViewById<EditText>(R.id.login)
        val parol:EditText = findViewById<EditText>(R.id.parol)
        val button:Button = findViewById<Button>(R.id.knopka)


        val loginText:String = login.text.toString()
        val parolText:String = parol.text.toString()
        if (loginText == trueLogin && parolText == trueparol)
        {
            Toast.makeText(applicationContext,"dannye verny", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(applicationContext, "dannye ne verny", Toast.LENGTH_SHORT).show()
        }



    }
}
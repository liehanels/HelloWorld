package com.liehan.helloworld

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.Console

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } //end of onCreate Method

        //code starts here

        val firstName = findViewById<EditText>(R.id.edTfirstName)
        val lastName = findViewById<EditText>(R.id.edTlastName)
        val age = findViewById<EditText>(R.id.edTAge) //returns a string
        val button = findViewById<Button>(R.id.btnGreet)

        button.setOnClickListener {
            var text1 = firstName.text.toString()
            var text2 = lastName.text.toString()
            var ageInt = Integer.parseInt(age.text.toString()) //from string to int

            var combinedText = "$text1 $text2 is $ageInt years old"

            Toast.makeText(this, combinedText, Toast.LENGTH_LONG).show()

            Log.i(TAG, "Hello $combinedText")
        }
    }
}

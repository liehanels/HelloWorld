package com.liehan.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
        val button = findViewById<Button>(R.id.btnGreet)

        button.setOnClickListener {
            val text1 = firstName.text.toString()
            val text2 = lastName.text.toString()
            val combinedText = "$text1 $text2"
            Toast.makeText(this, combinedText, Toast.LENGTH_LONG).show()
        }
    }
}

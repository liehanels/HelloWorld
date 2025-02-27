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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } //code starts here
        //elements declared here from the UI
        //val valueName = findViewById<Type of element>(R.id.elementName)
        val firstName = findViewById<EditText>(R.id.edTfirstName)
        val lastName = findViewById<EditText>(R.id.edTlastName)
        val age = findViewById<EditText>(R.id.edTAge)
        val button = findViewById<Button>(R.id.btnGreet)

        //define the button click event (what happens if the button is clicked)
        button.setOnClickListener {
            //var variableName = valueName(elementName).what-data-type.convert-into-string
            var text1 = firstName.text.toString()
            var text2 = lastName.text.toString()
            //var variableName = new-data-type.parseType(old-data-type)
            var ageInt = Integer.parseInt(age.text.toString()) //from string to int
            var combinedText = "$text1 $text2 is $ageInt years old"

            //Toast.makeText(where-to-show, what-to-show, how-long-to-show).show()
            Toast.makeText(this, combinedText, Toast.LENGTH_LONG).show()
            //Write-to-log.type-of-message(TAG, message)
            Log.i(TAG, "Hello $combinedText")
        }
    } //end of the onCreate method
} // end of the main activity

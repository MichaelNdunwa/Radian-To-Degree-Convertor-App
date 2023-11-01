package com.example.radiantodegreeconvertor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.radiantodegreeconvertor.converters.RadianToDegree
import com.example.radiantodegreeconvertor.converters.DegreeToRadian

class MainActivity : AppCompatActivity() {

    private lateinit var degreeButton: Button
    private lateinit var radianButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        degreeButton = findViewById(R.id.degree_button)
        radianButton = findViewById(R.id.radian_button)

        // switch to RadianToDegree Activity:
        degreeButton.setOnClickListener {
            val degreeActivity = Intent(this, RadianToDegree::class.java)
            startActivity(degreeActivity)
        }

        // switch to DegreeToRadian Activity:
        radianButton.setOnClickListener {
            val radianActivity = Intent(this, DegreeToRadian::class.java)
            startActivity(radianActivity)
        }
    }
}
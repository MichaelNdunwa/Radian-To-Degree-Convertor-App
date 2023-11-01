package com.example.radiantodegreeconvertor.converters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.radiantodegreeconvertor.R
import kotlin.math.PI

class DegreeToRadian : AppCompatActivity() {

    private lateinit var degreeValue: EditText
    private lateinit var calculate: Button
    private lateinit var displayRadianValue: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_degree_to_radian)

        degreeValue = findViewById(R.id.degree_edit_text)
        calculate = findViewById(R.id.convert_to_radian_button)
        displayRadianValue = findViewById(R.id.display_in_radian)

        calculate.setOnClickListener {
            val d = degreeValue.text.toString().toDouble()
            val result = d * (PI / 180)
            displayRadianValue.text = "The equivalent of ${d}° to Radian: ${"%.4f".format(result)}rad"
        }
    }
}
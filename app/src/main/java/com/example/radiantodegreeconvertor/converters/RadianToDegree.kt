package com.example.radiantodegreeconvertor.converters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.radiantodegreeconvertor.R
import kotlin.math.PI

class RadianToDegree : AppCompatActivity() {

    private lateinit var radianValue: EditText
    private lateinit var calculate: Button
    private lateinit var displayDegree: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radian_to_degree)

        radianValue = findViewById(R.id.radian_edit_text)
        calculate = findViewById(R.id.convert_to_degree_button)
        displayDegree = findViewById(R.id.display_radian_value_text_view)

        calculate.setOnClickListener {
            val r = radianValue.text.toString().toDouble()
            val result = r * (180 / PI)
            displayDegree.text = "The equivalent of ${r}rad to Degree: ${result}°"
        }
    }
}
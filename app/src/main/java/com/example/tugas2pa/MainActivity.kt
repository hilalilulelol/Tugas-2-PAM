package com.example.tugas2pa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas1pa.R

class MainActivity : AppCompatActivity() {

    private lateinit var input1: EditText
    private lateinit var input2: EditText
    private lateinit var radioGroup: RadioGroup
    private lateinit var btnCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input1 = findViewById(R.id.input1)
        input2 = findViewById(R.id.input2)
        radioGroup = findViewById(R.id.radioGroup)
        btnCalculate = findViewById(R.id.btnCalculate)

        btnCalculate.setOnClickListener {
            val num1 = input1.text.toString().toInt()
            val num2 = input2.text.toString().toInt()
            var result = 0

            when (radioGroup.checkedRadioButtonId) {
                R.id.radioAdd -> result = num1 + num2
                R.id.radioSubtract -> result = num1 - num2
                R.id.radioMultiply -> result = num1 * num2
                R.id.radioDivide -> result = num1 / num2
            }

            val intent = Intent(this, Activity2::class.java).apply {
                putExtra("result", result)
                putExtra("nama", "Hilal Dhiyaulhaq")
                putExtra("nim", "225150401111017")
            }
            startActivity(intent)
        }
    }
}

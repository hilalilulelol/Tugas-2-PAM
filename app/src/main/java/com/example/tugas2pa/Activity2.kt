package com.example.tugas2pa

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas1pa.R

class Activity2 : AppCompatActivity() {

    private lateinit var resultView: TextView
    private lateinit var nimView: TextView
    private lateinit var namaView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        resultView = findViewById(R.id.resultView)
        nimView = findViewById(R.id.nimView)
        namaView = findViewById(R.id.namaView)

        val result = intent.getIntExtra("result", 0)
        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")

        resultView.text = "Hasil: $result"
        nimView.text = "NIM: $nim"
        namaView.text = "Nama: $nama"
    }
}

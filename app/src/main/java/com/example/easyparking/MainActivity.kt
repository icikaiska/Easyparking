package com.example.easyparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edtTittle : EditText
    lateinit var edtTextview : TextView
    lateinit var edtImage : ImageView
    lateinit var mbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtTittle = findViewById(R.id.mTvtittle)
        edtTextview = findViewById(R.id.mtextView)
        edtImage = findViewById(R.id.imageView3)
        mbtn = findViewById(R.id.mBtngetstarted)

        mbtn.setOnClickListener {
            var intent = Intent(this,Homepage::class.java)
            startActivity(intent)
        }
    }
}
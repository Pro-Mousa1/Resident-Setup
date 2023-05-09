package com.example.residenthomes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AdminActivity : AppCompatActivity() {
    lateinit var hostel:ImageView
    lateinit var viewHostel:ImageView
    lateinit var location:ImageView
    lateinit var viewLocation:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)
        hostel = findViewById(R.id.ImgAddhostel)
        viewHostel = findViewById(R.id.ImgViewHostel)
        location = findViewById(R.id.ImgAddLocation)
        viewLocation = findViewById(R.id.ImgViewLocation)

        hostel.setOnClickListener {
            val intent = Intent(this,AddHostelActivity::class.java)
            startActivity(intent)
        }
        viewHostel.setOnClickListener {
            val intent = Intent(this,ViewHostelActivity::class.java)
            startActivity(intent)
        }
    }
}
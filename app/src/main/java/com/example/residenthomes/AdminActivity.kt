package com.example.residenthomes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AdminActivity : AppCompatActivity() {
    lateinit var hostel:ImageView
    lateinit var viewHostel:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)
        hostel = findViewById(R.id.ImgAddhostel)
        viewHostel = findViewById(R.id.ImgViewHostel)

        hostel.setOnClickListener {
            val intent = Intent(this,AddHostelActivity::class.java)
            startActivity(intent)
        }
        viewHostel.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
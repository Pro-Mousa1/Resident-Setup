package com.example.residenthomes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DashBActivity : AppCompatActivity() {
    lateinit var admin:ImageView
    lateinit var hostel:ImageView
    lateinit var room:ImageView
    lateinit var location:ImageView
    lateinit var amenities:ImageView
    lateinit var logout:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_bactivity)
        admin = findViewById(R.id.ImgAdmin)
        hostel = findViewById(R.id.ImgHostel)
        room = findViewById(R.id.ImgRoom)
        location= findViewById(R.id.ImgLocation)
        amenities = findViewById(R.id.ImgAmenities)
        logout = findViewById(R.id.ImgLogout)

        admin.setOnClickListener {
            val intent = Intent(this, AdminActivity::class.java)
            startActivity(intent)
        }
        hostel.setOnClickListener {
            val intent = Intent()
            startActivity(intent)
        }
        room.setOnClickListener {
            val intent = Intent()
            startActivity(intent)
        }
        location.setOnClickListener {
            val intent = Intent()
            startActivity(intent)
        }
        amenities.setOnClickListener {
            val intent = Intent()
            startActivity(intent)
        }
        logout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
    }
}
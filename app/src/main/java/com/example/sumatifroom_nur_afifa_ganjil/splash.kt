package com.example.sumatifroom_nur_afifa_ganjil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()


        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        } ,3000)
    }

}

package com.example.rikoshop

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class splash : AppCompatActivity() {


    private val SPLASH_TIME_OUT:Long = 3000 // 1 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        Handler().postDelayed({

            val pindah = Intent(this@splash, MainActivity::class.java)
            startActivity(pindah)
            finish()
        }, SPLASH_TIME_OUT)
    }


}



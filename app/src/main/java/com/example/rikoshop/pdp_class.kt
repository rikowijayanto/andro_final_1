package com.example.rikoshop

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity

class pdp_class : AppCompatActivity() {

    private final val tag : String = "Produk Detail"


    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produkdetailpage)
        Log.d(tag, "OnCreate : Started")
    }
}
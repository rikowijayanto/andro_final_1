package com.example.rikoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlin.system.exitProcess

class halaman_tentang : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.halaman_tentang)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId) //memeriksan item mana yang di klik
        return super.onContextItemSelected(item)
    }


    //objek untuk memeriksa item yang di klik
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {

            R.id.beranda -> {
                val moveIntent = Intent(this@halaman_tentang, MainActivity::class.java )
                startActivity(moveIntent)
            }

            R.id.keluar -> {
                exitProcess(1)
            }


        }

    }
}

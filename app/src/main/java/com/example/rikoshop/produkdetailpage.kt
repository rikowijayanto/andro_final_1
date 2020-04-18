package com.example.rikoshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.Nullable
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_produkdetailpage.*

class produkdetailpage : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMAGE_URL = "Gambar tidak tersedia"
        const val EXTRA_HARGA = "Harga tidak tersedia"
        const val EXTRA_DESKRIPSI = "Deskripsi tidak dituliskan"
        const val EXTRA_LOKASI = "Lokasi tidak ditemukan"
    }

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produkdetailpage)

        showProductDetail()
    }


    private fun showProductDetail() {
        pdp_judul.setText(intent.getStringExtra(EXTRA_NAME))
        pdp_harga.setText(intent.getStringExtra(EXTRA_HARGA))
        pdp_deskripsi.setText(intent.getStringExtra(EXTRA_DESKRIPSI))
        pdp_lokasi.setText(intent.getStringExtra(EXTRA_LOKASI))

        Glide.with(this)
            .load(intent.getIntExtra(EXTRA_IMAGE_URL, 1)).into(pdp_gambar)
    }
}


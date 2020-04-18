package com.example.rikoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private lateinit var rvproduk: RecyclerView //deklarasi variabel produk
    //
    private var list: ArrayList<Produk> = arrayListOf() //mendefinisikan list
    private lateinit var listProdukAdapter: ListProdukAdapter
    private lateinit var gridProdukAdapter: GridHeroAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvproduk = findViewById(R.id.rv_shop)
        this.rvproduk.setHasFixedSize(true)


        //memanggil kelas

        list.addAll(ProdukData.listData)
        showRecyclerList()

        setListClickAction()


    }


    //memanggil function halaman berbentuk list
    private fun showRecyclerList() {
        rvproduk.layoutManager = LinearLayoutManager(this)
        listProdukAdapter = ListProdukAdapter(list)
        rvproduk.adapter = listProdukAdapter
    }


    private fun showRecyclerGrid() {
        rvproduk.layoutManager = GridLayoutManager(this, 2)
        gridProdukAdapter = GridHeroAdapter(list)
        rvproduk.adapter = gridProdukAdapter
    }





    //menampilkan list menu di tampilan awal halaman
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

            R.id.tentang -> {
                val moveIntent = Intent(this@MainActivity, halaman_tentang::class.java )
                startActivity(moveIntent)
            }

            R.id.keluar -> {
                exitProcess(1)
            }

            R.id.grid -> {
                showRecyclerGrid()
            }

            R.id.beranda -> {
                showRecyclerList()
            }


        }

    }


    private fun setListClickAction() {

        listProdukAdapter.setOnItemClickCallback(object : ListProdukAdapter.OnItemClickCallback {
            override fun onItemClick(data: Produk) {
                val pindah =
                    Intent(this@MainActivity, produkdetailpage::class.java)
                        .apply {
                            putExtra(produkdetailpage.EXTRA_NAME, data.nama)
                            putExtra(produkdetailpage.EXTRA_IMAGE_URL, data.gambar)
                            putExtra(produkdetailpage.EXTRA_HARGA, data.harga)
                            putExtra(produkdetailpage.EXTRA_DESKRIPSI, data.detail)
                            putExtra(produkdetailpage.EXTRA_LOKASI, data.lokasi)
                        }
                startActivity(pindah)
            }
        })


    }

}


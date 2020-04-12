package com.example.rikoshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvproduk: RecyclerView //deklarasi variabel produk
    private var list: ArrayList<Produk> = arrayListOf() //mendefinisikan list


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvproduk = findViewById(R.id.rv_shop)
        rvproduk.setHasFixedSize(true)


        //memanggil kelas

        list.addAll(ProdukData.listData)
        showRecyclerList()
    }


    //memanggil function halaman berbentuk list
    private fun showRecyclerList() {
        rvproduk.layoutManager = LinearLayoutManager(this)
        val listProdukAdapter = ListProdukAdapter(list)
        rvproduk.adapter = listProdukAdapter
    }


    //menampilkan list menu di tampilan awal halaman
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId) //memeriksan item mana yang di klik
        return super.onContextItemSelected(item)
    }


    //objek untuk memeriksa item yang di klik
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> { //menampilkan halaman list
                showRecyclerList()
            }


            R.id.action_cardview -> {
            }
        }
    }


}

package com.example.rikoshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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


    //memanggil function list
    private fun showRecyclerList() {
        rvproduk.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListProdukAdapter(list)
        rvproduk.adapter = listHeroAdapter
    }
}

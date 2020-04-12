package com.example.rikoshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


//membuat class adapter untuk produk

class ListProdukAdapter (var listproduk : ArrayList<Produk> ) : RecyclerView.Adapter <ListProdukAdapter.ListViewHolder> () {



    //implement all methos dari listprodukadapter

    override fun onCreateViewHolder (viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_shop, viewGroup, false)
        return ListViewHolder(view)
    }


    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val produk = listproduk[position] //menyimpan dalam bentuk produk

        Glide.with(holder.itemView.context)
            .load(produk.gambar)
            .apply(RequestOptions().override(55, 55))
            .into(holder.tvgambar)


        holder.tvnama.text = produk.nama   //menyimpan nama produk
        holder.tvdetail.text = produk.detail //menyimpan detail produk
        holder.tvharga.text = produk.harga //menyimpan harga produk
    }


    override fun getItemCount(): Int {
        return listproduk.size
    }



    //class inner inisiasi isi
    inner class ListViewHolder(itemView: View) :RecyclerView.ViewHolder (itemView) {
        var tvnama : TextView = itemView.findViewById(R.id.tv_item_name) //membaca dan inisiasi nama produk
        var tvdetail : TextView = itemView.findViewById(R.id.tv_item_detail) //membaca dan inisiasi detail produk
        var tvharga : TextView = itemView.findViewById(R.id.tv_item_harga) //membaca dan inisiasi harga produk
        var tvgambar : ImageView = itemView.findViewById(R.id.img_item_photo) //membaca dan inisiasi gambar produk
    }


}
package com.example.rikoshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class GridProdukAdapter (var listproduk : ArrayList<Produk> ): RecyclerView.Adapter <GridProdukAdapter.GridViewHolder> () {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_shop, viewGroup, false)
        return GridViewHolder(view)
    }


    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {

        val produk = listproduk[position] //mendeklarasikan sebuah variabel baru

        Glide.with(holder.itemView.context)
            .load(produk.gambar)
            .apply(RequestOptions().override(350, 750))
            .into(holder.tvgambar)
    }

    override fun getItemCount(): Int {
        return listproduk.size
    }


    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvgambar: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}
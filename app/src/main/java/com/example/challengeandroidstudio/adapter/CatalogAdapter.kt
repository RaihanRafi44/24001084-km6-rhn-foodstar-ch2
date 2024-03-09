package com.example.challengeandroidstudio.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.challengeandroidstudio.databinding.ItemCatalogBinding
import com.example.challengeandroidstudio.model.Catalog
import toIndonesianFormat

class CatalogAdapter : RecyclerView.Adapter<CatalogAdapter.CatalogViewHolder>(){

    private val data = mutableListOf<Catalog>()

    fun submitData(items: List<Catalog>){
        data.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogViewHolder {
        return CatalogViewHolder(ItemCatalogBinding.inflate
            (LayoutInflater.from(parent.context),
            parent,
            false))

    }

    //Counting the data size
    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: CatalogViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class CatalogViewHolder(private val binding : ItemCatalogBinding) :
        RecyclerView.ViewHolder(binding.root){
        fun bind(item : Catalog){
            binding.tvCatalogPrice.text = item.price.toIndonesianFormat()
            binding.tvCatalogName.text = item.name
            binding.ivCatalogImages.setImageResource(item.image)

        }
    }


}


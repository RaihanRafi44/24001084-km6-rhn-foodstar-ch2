package com.example.challengeandroidstudio.presentation.foodstarlist.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.challengeandroidstudio.R
import com.example.challengeandroidstudio.base.ViewHolderBinder
import com.example.challengeandroidstudio.data.model.Catalog
import com.example.challengeandroidstudio.databinding.ItemCatalogBinding
import com.example.challengeandroidstudio.databinding.ItemCatalogGridBinding
import toIndonesianFormat

class CatalogGridItemHolder(
    private val binding: ItemCatalogGridBinding,
    private val listener: OnItemClickedListeners<Catalog>
)    : ViewHolder(binding.root), ViewHolderBinder<Catalog> {
    override fun bind(item: Catalog) {
        item.let {
            binding.ivCatalogImages.load(it.image){
                crossfade(true)
                error(R.mipmap.ic_launcher_round)
            }
            binding.tvCatalogName.text = it.name
            binding.tvCatalogPrice.text = it.price.toIndonesianFormat()
            itemView.setOnClickListener{
                listener.onItemClicked(item)
            }
        }
    }
}

class CatalogListItemHolder (
    private val binding: ItemCatalogBinding,
    private val listener: OnItemClickedListeners<Catalog>
) : ViewHolder(binding.root), ViewHolderBinder<Catalog> {
    override fun bind(item: Catalog) {
        item.let {
            binding.ivCatalogImages.load(it.image){
                crossfade(true)
                error(R.mipmap.ic_launcher_round)
            }
            binding.tvCatalogName.text = it.name
            binding.tvCatalogPrice.text = it.price.toIndonesianFormat()
            itemView.setOnClickListener {
                listener.onItemClicked(item)
            }
        }
    }
}


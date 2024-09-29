package com.jubayer_ahamad_tayef.recylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import coil.load
import com.jubayer_ahamad_tayef.recylerview.databinding.ItemDesignBinding

class ItemAdapter : ListAdapter<ItemData, ItemViewHolder>(comparator) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        return ItemViewHolder(
            ItemDesignBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        getItem(position).let {

            holder.binding.imageView.load(getItem(position).imageUrl) {
                crossfade(true)
            }
            holder.binding.name.text = getItem(position).name
            holder.binding.lastMessage.text = getItem(position).lastMessage
            holder.binding.lastMessageTime.text = getItem(position).lastMessageTime

        }
    }

    companion object {

        val comparator = object : DiffUtil.ItemCallback<ItemData>() {
            override fun areItemsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
                return oldItem == newItem
            }


        }

    }
}
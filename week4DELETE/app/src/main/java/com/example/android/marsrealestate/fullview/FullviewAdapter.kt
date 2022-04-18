/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.example.android.marsrealestate.fullview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.marsrealestate.databinding.GridViewItemBinding
import com.example.android.marsrealestate.databinding.FragmentFullviewBinding
import com.example.android.marsrealestate.network.MarsProperty


/**
 * This class implements a [RecyclerView] [ListAdapter] which uses Data Binding to present [List]
 * data, including computing diffs between lists.
 * @param onClick a lambda that takes the
 */

//利用FullviewAdapter.MarsPropertyViewHolder來呈現一個<MarsProperty>物件的list
//MarsProperty是指data class，有id、type、price、isRental變數，在network package被定義
//class FullviewAdapter: ListAdapter<MarsProperty, FullviewAdapter.MarsPropertyViewHolder>(DiffCallback) {

class FullviewAdapter: ListAdapter<MarsProperty, RecyclerView.ViewHolder>(DiffCallback) {

    /**
     * The MarsPropertyViewHolder constructor takes the binding variable from the associated
     * GridViewItem, which nicely gives it access to the full [MarsProperty] information.
     */
    //創造一個內部類別(inner class): MarsPropertyViewHolder，執行bind()來binding至marsProperty
    //MarsPropertyViewHolder用來擴展RecyclerView.ViewHolder
    //原本是binding: GridViewItemBinding 來處理gridview的item
//    class MarsPropertyViewHolder(private var binding: FragmentFullviewBinding):

    class MarsPropertyViewHolder private constructor(val binding: FragmentFullviewBinding):
            RecyclerView.ViewHolder(binding.root) {

        fun bind(marsProperty: MarsProperty) {
            binding.CCC = XXX
            // This is important, because it forces the data binding to execute immediately,
            // which allows the RecyclerView to make the correct view size measurements
            binding.executePendingBindings()
            //            binding.viewModel.properties = marsProperty
        }
    }

    /**
     * Allows the RecyclerView to determine which items have changed when the [List] of [MarsProperty]
     * has been updated.
     */
    companion object DiffCallback : DiffUtil.ItemCallback<MarsProperty>() {
        override fun areItemsTheSame(oldItem: MarsProperty, newItem: MarsProperty): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: MarsProperty, newItem: MarsProperty): Boolean {
            return oldItem.id == newItem.id
        }
    }

    /**
     * Create new [RecyclerView] item views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): RecyclerView.ViewHolder {
        return RecyclerView.ViewHolder(FragmentFullviewBinding.inflate(LayoutInflater.from(parent.context)))
    }

    /**
     * Replaces the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val marsProperty = getItem(position)
        holder.bind(marsProperty)
//        holder.itemView.setOnClickListener {
//            onClickListener.onClick(marsProperty)
//        }

    }

//    /**
//     * Custom listener that handles clicks on [RecyclerView] items.  Passes the [MarsProperty]
//     * associated with the current item to the [onClick] function.
//     * @param clickListener lambda that will be called with the current [MarsProperty]
//     */
//    class OnClickListener(val clickListener: (marsProperty:MarsProperty) -> Unit) {
//        fun onClick(marsProperty:MarsProperty) = clickListener(marsProperty)
//    }

}

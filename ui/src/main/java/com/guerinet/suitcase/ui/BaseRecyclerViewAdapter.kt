/*
 * Copyright 2016-2021 Julien Guerinet
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
 */

package com.guerinet.suitcase.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

/**
 * Basic RecyclerView adapter implementation for [RecyclerView]s
 * @author Julien Guerinet
 * @since 2.0.0
 *
 * @param emptyView [View] to show if the list is empty, null if none (defaults to null)
 */
abstract class BaseRecyclerViewAdapter(val emptyView: View? = null) :
    RecyclerView.Adapter<BaseRecyclerViewAdapter.BaseHolder>() {

    override fun onBindViewHolder(holder: BaseHolder, position: Int) {
        holder.bind(position)
    }

    /**
     * Determines whether the [emptyView], if there is one, [isVisible] or not
     */
    open fun showEmptyView(isVisible: Boolean) {
        emptyView?.visibility = if (isVisible) View.VISIBLE else View.GONE
    }

    /**
     * Basic implementation of the [RecyclerView.ViewHolder]
     */
    open class BaseHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        /**
         * Convenience constructor taking the [parent] and the [layoutId] of the item view to create
         */
        constructor(parent: ViewGroup, @LayoutRes layoutId: Int) :
            this(LayoutInflater.from(parent.context).inflate(layoutId, parent, false))

        /**
         * Binds this holder to the given [position]
         */
        open fun bind(position: Int) {}
    }
}

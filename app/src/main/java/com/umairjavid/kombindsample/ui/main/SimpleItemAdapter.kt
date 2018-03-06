package com.umairjavid.kombindsample.ui.main

import android.databinding.ObservableArrayList
import com.umairjavid.kombind.ui.KombindAdapter
import com.umairjavid.kombindsample.R
import com.umairjavid.kombindsample.model.SimpleHeader
import com.umairjavid.kombindsample.model.SimpleItem

class SimpleItemAdapter(private val items: ObservableArrayList<Any>, override val handler: Any?) : KombindAdapter<Any, KombindAdapter.ViewHolder>(items) {
    override fun getLayout(position: Int) =
            if (items[position] is SimpleHeader) R.layout.item_simpleheader else R.layout.item_simpleitem

    interface ActionHandler {
        fun onSimpleItemClick(simpleItem: SimpleItem)

        fun onDeleteClick(simpleItemId: Int)
    }
}

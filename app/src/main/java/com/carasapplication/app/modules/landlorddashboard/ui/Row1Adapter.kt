package com.carasapplication.app.modules.landlorddashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowRow3Binding
import com.carasapplication.app.modules.landlorddashboard.`data`.model.`3RowModel`
import kotlin.Int
import kotlin.collections.List

class Row1Adapter(
  var list: List<`3RowModel`>
) : RecyclerView.Adapter<Row1Adapter.RowRow3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRow3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_row3,parent,false)
    return RowRow3VH(view)
  }

  override fun onBindViewHolder(holder: RowRow3VH, position: Int) {
    val 3RowModel = `3RowModel`()
    // TODO uncomment following line after integration with data source
    // val 3RowModel = list[position]
    holder.binding.3RowModel = 3RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<`3RowModel`>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: `3RowModel`
    ) {
    }
  }

  inner class RowRow3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRow3Binding = RowRow3Binding.bind(itemView)
  }
}

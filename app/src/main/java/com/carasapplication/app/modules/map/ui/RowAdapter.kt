package com.carasapplication.app.modules.map.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowRow1Binding
import com.carasapplication.app.modules.map.`data`.model.`1RowModel`
import kotlin.Int
import kotlin.collections.List

class RowAdapter(
  var list: List<`1RowModel`>
) : RecyclerView.Adapter<RowAdapter.RowRow1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRow1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_row1,parent,false)
    return RowRow1VH(view)
  }

  override fun onBindViewHolder(holder: RowRow1VH, position: Int) {
    val 1RowModel = `1RowModel`()
    // TODO uncomment following line after integration with data source
    // val 1RowModel = list[position]
    holder.binding.1RowModel = 1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<`1RowModel`>) {
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
      item: `1RowModel`
    ) {
    }
  }

  inner class RowRow1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRow1Binding = RowRow1Binding.bind(itemView)
  }
}

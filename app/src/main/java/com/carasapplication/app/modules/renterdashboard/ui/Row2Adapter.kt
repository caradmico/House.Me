package com.carasapplication.app.modules.renterdashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowRow6Binding
import com.carasapplication.app.modules.renterdashboard.`data`.model.`6RowModel`
import kotlin.Int
import kotlin.collections.List

class Row2Adapter(
  var list: List<`6RowModel`>
) : RecyclerView.Adapter<Row2Adapter.RowRow6VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRow6VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_row6,parent,false)
    return RowRow6VH(view)
  }

  override fun onBindViewHolder(holder: RowRow6VH, position: Int) {
    val 6RowModel = `6RowModel`()
    // TODO uncomment following line after integration with data source
    // val 6RowModel = list[position]
    holder.binding.6RowModel = 6RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<`6RowModel`>) {
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
      item: `6RowModel`
    ) {
    }
  }

  inner class RowRow6VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRow6Binding = RowRow6Binding.bind(itemView)
  }
}

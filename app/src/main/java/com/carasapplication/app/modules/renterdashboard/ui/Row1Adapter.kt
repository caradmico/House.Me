package com.carasapplication.app.modules.renterdashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowRow5Binding
import com.carasapplication.app.modules.renterdashboard.`data`.model.`5RowModel`
import kotlin.Int
import kotlin.collections.List

class Row1Adapter(
  var list: List<`5RowModel`>
) : RecyclerView.Adapter<Row1Adapter.RowRow5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRow5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_row5,parent,false)
    return RowRow5VH(view)
  }

  override fun onBindViewHolder(holder: RowRow5VH, position: Int) {
    val 5RowModel = `5RowModel`()
    // TODO uncomment following line after integration with data source
    // val 5RowModel = list[position]
    holder.binding.5RowModel = 5RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<`5RowModel`>) {
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
      item: `5RowModel`
    ) {
    }
  }

  inner class RowRow5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRow5Binding = RowRow5Binding.bind(itemView)
  }
}

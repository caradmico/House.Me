package com.carasapplication.app.modules.landlorddashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowRow2Binding
import com.carasapplication.app.modules.landlorddashboard.`data`.model.`2RowModel`
import kotlin.Int
import kotlin.collections.List

class RowAdapter(
  var list: List<`2RowModel`>
) : RecyclerView.Adapter<RowAdapter.RowRow2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRow2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_row2,parent,false)
    return RowRow2VH(view)
  }

  override fun onBindViewHolder(holder: RowRow2VH, position: Int) {
    val 2RowModel = `2RowModel`()
    // TODO uncomment following line after integration with data source
    // val 2RowModel = list[position]
    holder.binding.2RowModel = 2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<`2RowModel`>) {
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
      item: `2RowModel`
    ) {
    }
  }

  inner class RowRow2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRow2Binding = RowRow2Binding.bind(itemView)
  }
}

package com.carasapplication.app.modules.renterdashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowRow4Binding
import com.carasapplication.app.modules.renterdashboard.`data`.model.`4RowModel`
import kotlin.Int
import kotlin.collections.List

class RowAdapter(
  var list: List<`4RowModel`>
) : RecyclerView.Adapter<RowAdapter.RowRow4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRow4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_row4,parent,false)
    return RowRow4VH(view)
  }

  override fun onBindViewHolder(holder: RowRow4VH, position: Int) {
    val 4RowModel = `4RowModel`()
    // TODO uncomment following line after integration with data source
    // val 4RowModel = list[position]
    holder.binding.4RowModel = 4RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<`4RowModel`>) {
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
      item: `4RowModel`
    ) {
    }
  }

  inner class RowRow4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRow4Binding = RowRow4Binding.bind(itemView)
  }
}

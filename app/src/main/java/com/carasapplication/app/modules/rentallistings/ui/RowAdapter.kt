package com.carasapplication.app.modules.rentallistings.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowRowBinding
import com.carasapplication.app.modules.rentallistings.`data`.model.RowModel
import kotlin.Int
import kotlin.collections.List

class RowAdapter(
  var list: List<RowModel>
) : RecyclerView.Adapter<RowAdapter.RowRowVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRowVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_row,parent,false)
    return RowRowVH(view)
  }

  override fun onBindViewHolder(holder: RowRowVH, position: Int) {
    val rowModel = RowModel()
    // TODO uncomment following line after integration with data source
    // val rowModel = list[position]
    holder.binding.rowModel = rowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<RowModel>) {
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
      item: RowModel
    ) {
    }
  }

  inner class RowRowVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRowBinding = RowRowBinding.bind(itemView)
  }
}

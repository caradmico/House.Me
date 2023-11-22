package com.carasapplication.app.modules.renterdashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowListframeBinding
import com.carasapplication.app.modules.renterdashboard.`data`.model.ListframeRowModel
import kotlin.Int
import kotlin.collections.List

class ListframeAdapter(
  var list: List<ListframeRowModel>
) : RecyclerView.Adapter<ListframeAdapter.RowListframeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListframeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listframe,parent,false)
    return RowListframeVH(view)
  }

  override fun onBindViewHolder(holder: RowListframeVH, position: Int) {
    val listframeRowModel = ListframeRowModel()
    // TODO uncomment following line after integration with data source
    // val listframeRowModel = list[position]
    holder.binding.listframeRowModel = listframeRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListframeRowModel>) {
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
      item: ListframeRowModel
    ) {
    }
  }

  inner class RowListframeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListframeBinding = RowListframeBinding.bind(itemView)
  }
}

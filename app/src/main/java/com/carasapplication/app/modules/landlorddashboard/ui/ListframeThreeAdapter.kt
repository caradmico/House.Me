package com.carasapplication.app.modules.landlorddashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowListframeThreeBinding
import com.carasapplication.app.modules.landlorddashboard.`data`.model.ListframeThreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListframeThreeAdapter(
  var list: List<ListframeThreeRowModel>
) : RecyclerView.Adapter<ListframeThreeAdapter.RowListframeThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListframeThreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listframe_three,parent,false)
    return RowListframeThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListframeThreeVH, position: Int) {
    val listframeThreeRowModel = ListframeThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listframeThreeRowModel = list[position]
    holder.binding.listframeThreeRowModel = listframeThreeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListframeThreeRowModel>) {
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
      item: ListframeThreeRowModel
    ) {
    }
  }

  inner class RowListframeThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListframeThreeBinding = RowListframeThreeBinding.bind(itemView)
  }
}

package com.carasapplication.app.modules.admindashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowListframe1Binding
import com.carasapplication.app.modules.admindashboard.`data`.model.Listframe1RowModel
import kotlin.Int
import kotlin.collections.List

class ListframeAdapter(
  var list: List<Listframe1RowModel>
) : RecyclerView.Adapter<ListframeAdapter.RowListframe1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListframe1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listframe1,parent,false)
    return RowListframe1VH(view)
  }

  override fun onBindViewHolder(holder: RowListframe1VH, position: Int) {
    val listframe1RowModel = Listframe1RowModel()
    // TODO uncomment following line after integration with data source
    // val listframe1RowModel = list[position]
    holder.binding.listframe1RowModel = listframe1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listframe1RowModel>) {
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
      item: Listframe1RowModel
    ) {
    }
  }

  inner class RowListframe1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListframe1Binding = RowListframe1Binding.bind(itemView)
  }
}

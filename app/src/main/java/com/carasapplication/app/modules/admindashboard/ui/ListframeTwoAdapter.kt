package com.carasapplication.app.modules.admindashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowListframeTwoBinding
import com.carasapplication.app.modules.admindashboard.`data`.model.ListframeTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListframeTwoAdapter(
  var list: List<ListframeTwoRowModel>
) : RecyclerView.Adapter<ListframeTwoAdapter.RowListframeTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListframeTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listframe_two,parent,false)
    return RowListframeTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListframeTwoVH, position: Int) {
    val listframeTwoRowModel = ListframeTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listframeTwoRowModel = list[position]
    holder.binding.listframeTwoRowModel = listframeTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListframeTwoRowModel>) {
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
      item: ListframeTwoRowModel
    ) {
    }
  }

  inner class RowListframeTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListframeTwoBinding = RowListframeTwoBinding.bind(itemView)
  }
}

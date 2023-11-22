package com.carasapplication.app.modules.map.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowListavatar1Binding
import com.carasapplication.app.modules.map.`data`.model.Listavatar1RowModel
import kotlin.Int
import kotlin.collections.List

class ListavatarAdapter(
  var list: List<Listavatar1RowModel>
) : RecyclerView.Adapter<ListavatarAdapter.RowListavatar1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListavatar1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listavatar1,parent,false)
    return RowListavatar1VH(view)
  }

  override fun onBindViewHolder(holder: RowListavatar1VH, position: Int) {
    val listavatar1RowModel = Listavatar1RowModel()
    // TODO uncomment following line after integration with data source
    // val listavatar1RowModel = list[position]
    holder.binding.listavatar1RowModel = listavatar1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listavatar1RowModel>) {
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
      item: Listavatar1RowModel
    ) {
    }
  }

  inner class RowListavatar1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListavatar1Binding = RowListavatar1Binding.bind(itemView)
  }
}

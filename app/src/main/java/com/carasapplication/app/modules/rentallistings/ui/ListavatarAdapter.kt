package com.carasapplication.app.modules.rentallistings.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowListavatarBinding
import com.carasapplication.app.modules.rentallistings.`data`.model.ListavatarRowModel
import kotlin.Int
import kotlin.collections.List

class ListavatarAdapter(
  var list: List<ListavatarRowModel>
) : RecyclerView.Adapter<ListavatarAdapter.RowListavatarVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListavatarVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listavatar,parent,false)
    return RowListavatarVH(view)
  }

  override fun onBindViewHolder(holder: RowListavatarVH, position: Int) {
    val listavatarRowModel = ListavatarRowModel()
    // TODO uncomment following line after integration with data source
    // val listavatarRowModel = list[position]
    holder.binding.listavatarRowModel = listavatarRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListavatarRowModel>) {
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
      item: ListavatarRowModel
    ) {
    }
  }

  inner class RowListavatarVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListavatarBinding = RowListavatarBinding.bind(itemView)
  }
}

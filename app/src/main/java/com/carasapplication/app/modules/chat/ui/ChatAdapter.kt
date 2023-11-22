package com.carasapplication.app.modules.chat.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.carasapplication.app.R
import com.carasapplication.app.databinding.RowChatBinding
import com.carasapplication.app.modules.chat.`data`.model.ChatRowModel
import kotlin.Int
import kotlin.collections.List

class ChatAdapter(
  var list: List<ChatRowModel>
) : RecyclerView.Adapter<ChatAdapter.RowChatVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowChatVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_chat,parent,false)
    return RowChatVH(view)
  }

  override fun onBindViewHolder(holder: RowChatVH, position: Int) {
    val chatRowModel = ChatRowModel()
    // TODO uncomment following line after integration with data source
    // val chatRowModel = list[position]
    holder.binding.chatRowModel = chatRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ChatRowModel>) {
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
      item: ChatRowModel
    ) {
    }
  }

  inner class RowChatVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowChatBinding = RowChatBinding.bind(itemView)
  }
}

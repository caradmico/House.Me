package com.carasapplication.app.modules.chat.ui

import android.view.View
import androidx.activity.viewModels
import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.base.BaseActivity
import com.carasapplication.app.databinding.ActivityChatBinding
import com.carasapplication.app.modules.chat.`data`.model.ChatRowModel
import com.carasapplication.app.modules.chat.`data`.viewmodel.ChatVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChatActivity : BaseActivity<ActivityChatBinding>(R.layout.activity_chat) {
  private val viewModel: ChatVM by viewModels<ChatVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val chatAdapter = ChatAdapter(viewModel.chatList.value?:mutableListOf())
    binding.recyclerChat.adapter = chatAdapter
    chatAdapter.setOnItemClickListener(
    object : ChatAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ChatRowModel) {
        onClickRecyclerChat(view, position, item)
      }
    }
    )
    viewModel.chatList.observe(this) {
      chatAdapter.updateData(it)
    }
    binding.chatVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerChat(
    view: View,
    position: Int,
    item: ChatRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHAT_ACTIVITY"

  }
}

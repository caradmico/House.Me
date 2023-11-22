package com.carasapplication.app.modules.chat.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carasapplication.app.modules.chat.`data`.model.ChatModel
import com.carasapplication.app.modules.chat.`data`.model.ChatRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChatVM : ViewModel(), KoinComponent {
  val chatModel: MutableLiveData<ChatModel> = MutableLiveData(ChatModel())

  var navArguments: Bundle? = null

  val chatList: MutableLiveData<MutableList<ChatRowModel>> = MutableLiveData(mutableListOf())
}

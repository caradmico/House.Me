package com.carasapplication.app.modules.chat.`data`.model

import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitle: String? = MyApp.getInstance().resources.getString(R.string.msg_available_for_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_profile)

)

package com.carasapplication.app.modules.renterdashboard.`data`.model

import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListframeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)

)

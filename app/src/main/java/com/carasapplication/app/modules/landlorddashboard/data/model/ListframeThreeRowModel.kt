package com.carasapplication.app.modules.landlorddashboard.`data`.model

import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListframeThreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameThree: String? = MyApp.getInstance().resources.getString(R.string.lbl4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitle: String? = MyApp.getInstance().resources.getString(R.string.msg_25th_august_202)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitleOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_credit_check_ap)

)

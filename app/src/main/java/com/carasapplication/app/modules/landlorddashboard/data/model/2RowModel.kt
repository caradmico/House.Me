package com.carasapplication.app.modules.landlorddashboard.`data`.model

import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class `2RowModel`(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_apartment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.msg_southside_heigh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_2_bedrooms_12)

)

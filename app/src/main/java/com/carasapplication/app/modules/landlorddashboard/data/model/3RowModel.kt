package com.carasapplication.app.modules.landlorddashboard.`data`.model

import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class `3RowModel`(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOneTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_excellent_credi)

)

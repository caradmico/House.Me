package com.carasapplication.app.modules.rentallistings.`data`.model

import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListavatarRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOneThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_great_experienc)

)

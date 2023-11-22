package com.carasapplication.app.modules.renterdashboard.`data`.model

import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class `4RowModel`(
  /**
   * TODO Replace with dynamic value
   */
  var txtImageCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_image_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_product_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_data_1)

)

package com.carasapplication.app.modules.renterdashboard.`data`.model

import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class `6RowModel`(
  /**
   * TODO Replace with dynamic value
   */
  var txtImageCounterFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_image_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductCounterFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_product_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataCounterFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_data_5)

)

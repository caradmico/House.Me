package com.carasapplication.app.modules.renterdashboard.`data`.model

import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class `5RowModel`(
  /**
   * TODO Replace with dynamic value
   */
  var txtImageCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_image_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductCounterTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_product_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_data_3)

)

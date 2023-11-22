package com.carasapplication.app.modules.admindashboard.`data`.model

import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListframeTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_amount_50)

)

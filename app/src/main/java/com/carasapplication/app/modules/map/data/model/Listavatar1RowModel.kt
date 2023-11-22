package com.carasapplication.app.modules.map.`data`.model

import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listavatar1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUserCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_review_1)

)

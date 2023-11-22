package com.carasapplication.app.modules.renterdashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carasapplication.app.modules.renterdashboard.`data`.model.ListframeRowModel
import com.carasapplication.app.modules.renterdashboard.`data`.model.RenterDashboardModel
import com.carasapplication.app.modules.renterdashboard.`data`.model.`4RowModel`
import com.carasapplication.app.modules.renterdashboard.`data`.model.`5RowModel`
import com.carasapplication.app.modules.renterdashboard.`data`.model.`6RowModel`
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RenterDashboardVM : ViewModel(), KoinComponent {
  val renterDashboardModel: MutableLiveData<RenterDashboardModel> =
      MutableLiveData(RenterDashboardModel())

  var navArguments: Bundle? = null

  val rowList: MutableLiveData<MutableList<`4RowModel`>> = MutableLiveData(mutableListOf())

  val row1List: MutableLiveData<MutableList<`5RowModel`>> = MutableLiveData(mutableListOf())

  val row2List: MutableLiveData<MutableList<`6RowModel`>> = MutableLiveData(mutableListOf())

  val listframeList: MutableLiveData<MutableList<ListframeRowModel>> =
      MutableLiveData(mutableListOf())
}

package com.carasapplication.app.modules.landlorddashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carasapplication.app.modules.landlorddashboard.`data`.model.LandlordDashboardModel
import com.carasapplication.app.modules.landlorddashboard.`data`.model.ListframeThreeRowModel
import com.carasapplication.app.modules.landlorddashboard.`data`.model.`2RowModel`
import com.carasapplication.app.modules.landlorddashboard.`data`.model.`3RowModel`
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LandlordDashboardVM : ViewModel(), KoinComponent {
  val landlordDashboardModel: MutableLiveData<LandlordDashboardModel> =
      MutableLiveData(LandlordDashboardModel())

  var navArguments: Bundle? = null

  val listframeThreeList: MutableLiveData<MutableList<ListframeThreeRowModel>> =
      MutableLiveData(mutableListOf())

  val rowList: MutableLiveData<MutableList<`2RowModel`>> = MutableLiveData(mutableListOf())

  val row1List: MutableLiveData<MutableList<`3RowModel`>> = MutableLiveData(mutableListOf())
}

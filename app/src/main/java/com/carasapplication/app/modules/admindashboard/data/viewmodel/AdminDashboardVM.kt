package com.carasapplication.app.modules.admindashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carasapplication.app.modules.admindashboard.`data`.model.AdminDashboardModel
import com.carasapplication.app.modules.admindashboard.`data`.model.Listframe1RowModel
import com.carasapplication.app.modules.admindashboard.`data`.model.ListframeTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AdminDashboardVM : ViewModel(), KoinComponent {
  val adminDashboardModel: MutableLiveData<AdminDashboardModel> =
      MutableLiveData(AdminDashboardModel())

  var navArguments: Bundle? = null

  val listframeList: MutableLiveData<MutableList<Listframe1RowModel>> =
      MutableLiveData(mutableListOf())

  val listframeTwoList: MutableLiveData<MutableList<ListframeTwoRowModel>> =
      MutableLiveData(mutableListOf())
}

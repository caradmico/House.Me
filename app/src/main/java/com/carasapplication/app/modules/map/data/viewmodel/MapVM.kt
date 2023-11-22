package com.carasapplication.app.modules.map.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carasapplication.app.modules.map.`data`.model.Listavatar1RowModel
import com.carasapplication.app.modules.map.`data`.model.MapModel
import com.carasapplication.app.modules.map.`data`.model.`1RowModel`
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MapVM : ViewModel(), KoinComponent {
  val mapModel: MutableLiveData<MapModel> = MutableLiveData(MapModel())

  var navArguments: Bundle? = null

  val rowList: MutableLiveData<MutableList<`1RowModel`>> = MutableLiveData(mutableListOf())

  val listavatarList: MutableLiveData<MutableList<Listavatar1RowModel>> =
      MutableLiveData(mutableListOf())
}

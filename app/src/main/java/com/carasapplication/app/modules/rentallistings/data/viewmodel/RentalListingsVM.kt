package com.carasapplication.app.modules.rentallistings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carasapplication.app.modules.rentallistings.`data`.model.ListavatarRowModel
import com.carasapplication.app.modules.rentallistings.`data`.model.RentalListingsModel
import com.carasapplication.app.modules.rentallistings.`data`.model.RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RentalListingsVM : ViewModel(), KoinComponent {
  val rentalListingsModel: MutableLiveData<RentalListingsModel> =
      MutableLiveData(RentalListingsModel())

  var navArguments: Bundle? = null

  val rowList: MutableLiveData<MutableList<RowModel>> = MutableLiveData(mutableListOf())

  val listavatarList: MutableLiveData<MutableList<ListavatarRowModel>> =
      MutableLiveData(mutableListOf())
}

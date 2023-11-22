package com.carasapplication.app.modules.map.ui

import android.view.View
import androidx.activity.viewModels
import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.base.BaseActivity
import com.carasapplication.app.databinding.ActivityMapBinding
import com.carasapplication.app.modules.map.`data`.model.Listavatar1RowModel
import com.carasapplication.app.modules.map.`data`.model.`1RowModel`
import com.carasapplication.app.modules.map.`data`.model.``1RowModel``
import com.carasapplication.app.modules.map.`data`.viewmodel.MapVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MapActivity : BaseActivity<ActivityMapBinding>(R.layout.activity_map) {
  private val viewModel: MapVM by viewModels<MapVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val rowAdapter = RowAdapter(viewModel.rowList.value?:mutableListOf())
    binding.recyclerRow.adapter = rowAdapter
    rowAdapter.setOnItemClickListener(
    object : RowAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : `1RowModel`) {
        onClickRecyclerRow(view, position, item)
      }
    }
    )
    viewModel.rowList.observe(this) {
      rowAdapter.updateData(it)
    }
    val listavatarAdapter = ListavatarAdapter(viewModel.listavatarList.value?:mutableListOf())
    binding.recyclerListavatar.adapter = listavatarAdapter
    listavatarAdapter.setOnItemClickListener(
    object : ListavatarAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listavatar1RowModel) {
        onClickRecyclerListavatar(view, position, item)
      }
    }
    )
    viewModel.listavatarList.observe(this) {
      listavatarAdapter.updateData(it)
    }
    binding.mapVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerRow(
    view: View,
    position: Int,
    item: ``1RowModel``
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListavatar(
    view: View,
    position: Int,
    item: Listavatar1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MAP_ACTIVITY"

  }
}

package com.carasapplication.app.modules.landlorddashboard.ui

import android.view.View
import androidx.activity.viewModels
import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.base.BaseActivity
import com.carasapplication.app.databinding.ActivityLandlordDashboardBinding
import com.carasapplication.app.modules.landlorddashboard.`data`.model.ListframeThreeRowModel
import com.carasapplication.app.modules.landlorddashboard.`data`.model.`2RowModel`
import com.carasapplication.app.modules.landlorddashboard.`data`.model.`3RowModel`
import com.carasapplication.app.modules.landlorddashboard.`data`.model.``2RowModel``
import com.carasapplication.app.modules.landlorddashboard.`data`.model.``3RowModel``
import com.carasapplication.app.modules.landlorddashboard.`data`.viewmodel.LandlordDashboardVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LandlordDashboardActivity :
    BaseActivity<ActivityLandlordDashboardBinding>(R.layout.activity_landlord_dashboard) {
  private val viewModel: LandlordDashboardVM by viewModels<LandlordDashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listframeThreeAdapter =
    ListframeThreeAdapter(viewModel.listframeThreeList.value?:mutableListOf())
    binding.recyclerListframeThree.adapter = listframeThreeAdapter
    listframeThreeAdapter.setOnItemClickListener(
    object : ListframeThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListframeThreeRowModel) {
        onClickRecyclerListframeThree(view, position, item)
      }
    }
    )
    viewModel.listframeThreeList.observe(this) {
      listframeThreeAdapter.updateData(it)
    }
    val rowAdapter = RowAdapter(viewModel.rowList.value?:mutableListOf())
    binding.recyclerRow.adapter = rowAdapter
    rowAdapter.setOnItemClickListener(
    object : RowAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : `2RowModel`) {
        onClickRecyclerRow(view, position, item)
      }
    }
    )
    viewModel.rowList.observe(this) {
      rowAdapter.updateData(it)
    }
    val row1Adapter = Row1Adapter(viewModel.row1List.value?:mutableListOf())
    binding.recyclerRow1.adapter = row1Adapter
    row1Adapter.setOnItemClickListener(
    object : Row1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : `3RowModel`) {
        onClickRecyclerRow1(view, position, item)
      }
    }
    )
    viewModel.row1List.observe(this) {
      row1Adapter.updateData(it)
    }
    binding.landlordDashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListframeThree(
    view: View,
    position: Int,
    item: ListframeThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerRow(
    view: View,
    position: Int,
    item: ``2RowModel``
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerRow1(
    view: View,
    position: Int,
    item: ``3RowModel``
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LANDLORD_DASHBOARD_ACTIVITY"

  }
}

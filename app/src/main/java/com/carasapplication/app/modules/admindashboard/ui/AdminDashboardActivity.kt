package com.carasapplication.app.modules.admindashboard.ui

import android.view.View
import androidx.activity.viewModels
import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.base.BaseActivity
import com.carasapplication.app.databinding.ActivityAdminDashboardBinding
import com.carasapplication.app.modules.admindashboard.`data`.model.Listframe1RowModel
import com.carasapplication.app.modules.admindashboard.`data`.model.ListframeTwoRowModel
import com.carasapplication.app.modules.admindashboard.`data`.viewmodel.AdminDashboardVM
import kotlin.Int
import kotlin.String

class AdminDashboardActivity :
        BaseActivity<ActivityAdminDashboardBinding>(R.layout.activity_admin_dashboard) {
    private val viewModel: AdminDashboardVM by viewModels<AdminDashboardVM>()

    override fun onInitialized() {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        val listframeAdapter = ListframeAdapter(viewModel.listframeList.value?:mutableListOf())
        binding.recyclerListframe.adapter = listframeAdapter
        listframeAdapter.setOnItemClickListener(
        object : ListframeAdapter.OnItemClickListener {
            override fun onItemClick(view:View, position:Int, item : Listframe1RowModel) {
                onClickRecyclerListframe(view, position, item)
            }
        }
        )
        viewModel.listframeList.observe(this) {
            listframeAdapter.updateData(it)
        }
        val listframeTwoAdapter =
                ListframeTwoAdapter(viewModel.listframeTwoList.value?:mutableListOf())
        binding.recyclerListframeTwo.adapter = listframeTwoAdapter
        listframeTwoAdapter.setOnItemClickListener(
        object : ListframeTwoAdapter.OnItemClickListener {
            override fun onItemClick(view:View, position:Int, item : ListframeTwoRowModel) {
                onClickRecyclerListframeTwo(view, position, item)
            }
        }
        )
        viewModel.listframeTwoList.observe(this) {
            listframeTwoAdapter.updateData(it)
        }
        binding.adminDashboardVM = viewModel
    }

    override fun setUpClicks() {
    }

    fun onClickRecyclerListframe(
        view: View,
        position: Int,
        item: Listframe1RowModel
    ) {
    }

    fun onClickRecyclerListframeTwo(
        view: View,
        position: Int,
        item: ListframeTwoRowModel
    ) {
    }

    companion object {
        const val TAG: String = "ADMIN_DASHBOARD_ACTIVITY"
    }
}

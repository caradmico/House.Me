package com.carasapplication.app.modules.rentallistings.ui

import android.view.View
import androidx.activity.viewModels
import com.carasapplication.app.R
import com.carasapplication.app.appcomponents.base.BaseActivity
import com.carasapplication.app.databinding.ActivityRentalListingsBinding
import com.carasapplication.app.modules.rentallistings.`data`.model.ListavatarRowModel
import com.carasapplication.app.modules.rentallistings.`data`.model.RowModel
import com.carasapplication.app.modules.rentallistings.`data`.viewmodel.RentalListingsVM
import kotlin.Int
import kotlin.String

class RentalListingsActivity :
        BaseActivity<ActivityRentalListingsBinding>(R.layout.activity_rental_listings) {
    private val viewModel: RentalListingsVM by viewModels<RentalListingsVM>()

    override fun onInitialized() {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        val rowAdapter = RowAdapter(viewModel.rowList.value?:mutableListOf())
        binding.recyclerRow.adapter = rowAdapter
        rowAdapter.setOnItemClickListener(
        object : RowAdapter.OnItemClickListener {
            override fun onItemClick(view:View, position:Int, item : RowModel) {
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
            override fun onItemClick(view:View, position:Int, item : ListavatarRowModel) {
                onClickRecyclerListavatar(view, position, item)
            }
        }
        )
        viewModel.listavatarList.observe(this) {
            listavatarAdapter.updateData(it)
        }
        binding.rentalListingsVM = viewModel
    }

    override fun setUpClicks() {
    }

    fun onClickRecyclerRow(
        view: View,
        position: Int,
        item: RowModel
    ) {
    }

    fun onClickRecyclerListavatar(
        view: View,
        position: Int,
        item: ListavatarRowModel
    ) {
    }

    companion object {
        const val TAG: String = "RENTAL_LISTINGS_ACTIVITY"
    }
}

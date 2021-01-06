package com.pmob.pencarianrs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pmob.pencarianrs.utils.RsData
import com.pmob.pencarianrs.utils.RsModel

class InfoActivity : AppCompatActivity() {
    private lateinit var rvUniv: RecyclerView
    private var list: ArrayList<RsModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        val actionbar = supportActionBar
        actionbar!!.title= "Informasi Rumah Sakit"

        rvUniv = findViewById(R.id.rv_univ)
        rvUniv.setHasFixedSize(true)

        list.addAll(RsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvUniv.layoutManager = LinearLayoutManager(this)
        val listUnivAdapter = RsAdapter(list)
        rvUniv.adapter = listUnivAdapter
    }


}
package com.pmob.parkir

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ParkirAdapter(val listUniv: ArrayList<ParkirModel>) : RecyclerView.Adapter<ParkirAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_parkir, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listUniv.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, rank, photo, overview, identity,long , lat) = listUniv[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvRank.text = rank

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_RANK, rank)
            moveDetail.putExtra(DetailActivity.EXTRA_NAME, name)
            moveDetail.putExtra(DetailActivity.EXTRA_PHOTO, photo)
            moveDetail.putExtra(DetailActivity.EXTRA_IDENTITY, identity)
            moveDetail.putExtra(DetailActivity.EXTRA_OVERVIEW, overview)
            moveDetail.putExtra(DetailActivity.EXTRA_LONG,long)
            moveDetail.putExtra(DetailActivity.EXTRA_LAT,lat)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvRank: TextView = itemView.findViewById(R.id.tv_item_rank)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

}
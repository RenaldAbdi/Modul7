package com.example.uts_renald

import android.content.Context
import android.provider.ContactsContract.Data
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MemberAdapter (private val context: Context, private val member: List<DataMember>, val listener: (DataMember) -> Unit)
    : RecyclerView.Adapter<MemberAdapter.AnimeViewHolder>(){
    class AnimeViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgmember = view.findViewById<ImageView>(R.id.image_member)
        val namemember = view.findViewById<TextView>(R.id.nama_member)

        fun bindView(member: DataMember, listener: (DataMember) -> Unit){
            imgmember.setImageResource(member.imgmember)
            namemember.text = member.namemember
            itemView.setOnClickListener{
                (listener(member))
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_member, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.bindView(member[position], listener)
    }

    override fun getItemCount(): Int = member.size

}

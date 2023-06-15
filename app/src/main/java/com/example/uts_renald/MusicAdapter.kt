package com.example.uts_renald

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MusicAdapter (private val context: Context, private val music: List<Music>, val listener: (Music) -> Unit)
    : RecyclerView.Adapter<MusicAdapter.AnimeViewHolder>(){
    class AnimeViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgmusic = view.findViewById<ImageView>(R.id.img_item_photo)
        val namemusic = view.findViewById<TextView>(R.id.tv_item_name)
        val descmusic = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(music: Music, listener: (Music) -> Unit){
            imgmusic.setImageResource(music.imgmusic)
            namemusic.text = music.namemusic
            descmusic.text = music.descmusic
            itemView.setOnClickListener{
                (listener(music))
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_music, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.bindView(music[position], listener)
    }

    override fun getItemCount(): Int = music.size

}

package com.omtaem.recyclerviewinfragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.omtaem.recyclerviewinfragment.R
import com.omtaem.recyclerviewinfragment.model.Post


class PostRecyclerAdapter(val postList:ArrayList<Post>) : RecyclerView.Adapter<PostRecyclerAdapter.PostViewHolder>(){


    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val username : TextView = itemView.findViewById<TextView?>(R.id.textViewUserName)
        val postStatement : TextView = itemView.findViewById<TextView?>(R.id.textViewPostStatement)


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.post_row,parent,false) // ViewHolder için bağlanacak görüntüyü tanımladık
        return  PostViewHolder(itemView) // viewHolder döndürdük --> Recycler View ile Holder bağlandı

    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val currentItem = postList[position]

        holder.username.text = currentItem.userName
        holder.postStatement.text =  currentItem.postStatement


    }
    override fun getItemCount(): Int {
        // rcycler View içerisinde kaç tane satır olacak
        // (val kitapGorselListesi : ArrayList<Bitmap>) ==> bu listenin eleman sayısına ıulaşmak için constructor da listeyi aldık
        return postList.size
    }
}
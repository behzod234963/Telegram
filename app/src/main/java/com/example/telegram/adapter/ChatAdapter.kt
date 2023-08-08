package com.example.telegram.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.telegram.R
import com.example.telegram.model.User

class ChatAdapter(val list:ArrayList<User>):RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatAdapter.ChatViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_chat,parent,false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatAdapter.ChatViewHolder, position: Int) {
        val user=list[position]
        holder.tvFullname.text=user.fullname
        holder.tvMessage.text=user.message
        holder.tvTime.text=user.time
        Glide.with(holder.ivProfile).load(user.image).into(holder.ivProfile)
        if (user.status){

            holder.ivStatus.visibility=View.VISIBLE

        }else{

            holder.ivStatus.visibility=View.GONE

        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ChatViewHolder(view: View):RecyclerView.ViewHolder(view){

        val ivProfile=view.findViewById<ImageView>(R.id.iv_profile)
        val ivStatus=view.findViewById<ImageView>(R.id.iv_status)
        val tvFullname=view.findViewById<TextView>(R.id.tv_fullname)
        val tvTime=view.findViewById<TextView>(R.id.tv_time)
        val tvMessage=view.findViewById<TextView>(R.id.tv_message)



    }
}

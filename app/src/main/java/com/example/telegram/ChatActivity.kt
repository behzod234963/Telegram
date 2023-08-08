package com.example.telegram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram.adapter.ChatAdapter
import com.example.telegram.model.User

class ChatActivity: AppCompatActivity() {
    lateinit var userList:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        initView()

    }

    private fun initView() {
        loadList()
        val rvChatList=findViewById<RecyclerView>(R.id.rv_chatlist)
        rvChatList.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvChatList.adapter=ChatAdapter(userList)

    }
    fun loadList(){

        userList= ArrayList()
        userList.add(User("https://s1.cdn.autoevolution.com/images/news/r34-nissan-gt-r-looks-like-a-nismo-supercar-in-glossy-widebody-rendering-158511_1.jpg","Behzod","Today","🖐",true))
        userList.add(User("","Javohir","Today","🖐",true))
        userList.add(User("","Dilmurod","Today","🖐",true))
        userList.add(User("","Hasan aka","Today","🖐",true))
        userList.add(User("","Alibek","Today","🖐",false))
        userList.add(User("","Mustafo","Today","🖐",false))
        userList.add(User("","Zohirtoy","Today","🖐",false))
        userList.add(User("","Jonti","Today","🖐",true))
        userList.add(User("","Amir","Today","🖐",false))
        userList.add(User("https://s1.cdn.autoevolution.com/images/news/r34-nissan-gt-r-looks-like-a-nismo-supercar-in-glossy-widebody-rendering-158511_1.jpg","Behzod","Today","🖐",true))
        userList.add(User("","Javohir","Today","🖐",true))
        userList.add(User("","Dilmurod","Today","🖐",true))
        userList.add(User("","Hasan aka","Today","🖐",true))
        userList.add(User("","Alibek","Today","🖐",false))
        userList.add(User("","Mustafo","Today","🖐",false))
        userList.add(User("","Zohirtoy","Today","🖐",false))
        userList.add(User("","Jonti","Today","🖐",true))
        userList.add(User("","Amir","Today","🖐",false))
        userList.add(User("https://s1.cdn.autoevolution.com/images/news/r34-nissan-gt-r-looks-like-a-nismo-supercar-in-glossy-widebody-rendering-158511_1.jpg","Behzod","Today","🖐",true))
        userList.add(User("","Javohir","Today","🖐",true))
        userList.add(User("","Dilmurod","Today","🖐",true))
        userList.add(User("","Hasan aka","Today","🖐",true))
        userList.add(User("","Alibek","Today","🖐",false))
        userList.add(User("","Mustafo","Today","🖐",false))
        userList.add(User("","Zohirtoy","Today","🖐",false))
        userList.add(User("","Jonti","Today","🖐",true))
        userList.add(User("","Amir","Today","🖐",false))
        userList.add(User("https://s1.cdn.autoevolution.com/images/news/r34-nissan-gt-r-looks-like-a-nismo-supercar-in-glossy-widebody-rendering-158511_1.jpg","Behzod","Today","🖐",true))
        userList.add(User("","Javohir","Today","🖐",true))
        userList.add(User("","Dilmurod","Today","🖐",true))
        userList.add(User("","Hasan aka","Today","🖐",true))
        userList.add(User("","Alibek","Today","🖐",false))
        userList.add(User("","Mustafo","Today","🖐",false))
        userList.add(User("","Zohirtoy","Today","🖐",false))
        userList.add(User("","Jonti","Today","🖐",true))
        userList.add(User("","Amir","Today","🖐",false))
    }
}
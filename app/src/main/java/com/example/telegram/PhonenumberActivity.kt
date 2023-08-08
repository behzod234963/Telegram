package com.example.telegram

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PhonenumberActivity : AppCompatActivity() {

    lateinit var tvCountryCode:TextView
    lateinit var tvPhoneNumber:TextView
    lateinit var bNext:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phonenumber)

        initView()

    }

    private fun initView() {

        tvCountryCode=findViewById(R.id.tv_country_code)
        tvPhoneNumber=findViewById(R.id.tv_phoneNumber)
        bNext=findViewById(R.id.b_next)

        bNext.setOnClickListener {

            if (tvCountryCode.text.startsWith("+998")){

                for (i in tvPhoneNumber.text.indices){

                    if (tvPhoneNumber.text[i].isDigit()){

                        val openChat=Intent(this,ChatActivity::class.java)
                        startActivity(openChat)

                    }

                }

            }

        }

    }
}
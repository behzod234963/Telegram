package com.example.telegram

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        initViews()

    }

    private fun initViews() {

        Handler().postDelayed({

            openMainactivity()

        },2000)

    }
    private fun openMainactivity(){

        val openMainActivity=Intent(this,MainActivity::class.java)
        startActivity(openMainActivity)
        finish()

    }
}
package com.example.myshoppi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //레이아웃으로 안만들고 드로어블로 만들자
        //31이상에서는 splashScreen을 지원해줌

        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }
}
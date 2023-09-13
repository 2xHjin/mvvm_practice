package com.example.myshoppi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

//액티비티는 앱과 사용자가 상호작용하기 위한 진입점-사용자가 터치를하거나 스크롤을 내리거나
//이전버전의 구현체와 호환성을 지원하겠다-appcompat
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)//메서드
        //레이아웃을 전달받아서 액티비티를 띄움(레이아웃에 내부에 구현되어 있는것들을 위젯으로 바꾸는과정-레이아웃 인플레이트)
        setContentView(R.layout.activity_main)

        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.navigation_main)
        bottomNavigationView.itemIconTintList=null
    }
}
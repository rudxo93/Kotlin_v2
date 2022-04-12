package com.example.lovetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.lovetest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // navigation과 activity 연결
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        val
        
        // 바인딩 초기화
        val binding = ActivityMainBinding.inflate(layoutInflater);
3       // 레이아웃(root뷰) 표시
        setContentView(binding.root);
        // 뷰바인딩으로 버튼 접근
    }
}
package com.viatom.qqui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bp:BeBpResultView=findViewById(R.id.da)
        bp.setBPValue(120,80)
    }
}
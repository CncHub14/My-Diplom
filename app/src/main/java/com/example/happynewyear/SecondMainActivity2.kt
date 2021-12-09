package com.example.happynewyear

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondMainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_main2)
    }

    fun nextAct(view: View) {
        val nextActive = Intent(this, ThirdActivity2::class.java)
        startActivity(nextActive)
    }

    fun prevAct(view: View) {
        val prevAc = Intent(this, MainActivity::class.java)
        startActivity(prevAc)
    }
}
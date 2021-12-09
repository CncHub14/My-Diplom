package com.example.happynewyear

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ThirdActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third2)
    }


    fun homeAct(view: View) {
        val nextActive = Intent(this, MainActivity::class.java)
        startActivity(nextActive)
    }

    fun prevAct(view: View) {
        val randomIntent = Intent(this, SecondMainActivity2::class.java)
        startActivity(randomIntent)
    }
}
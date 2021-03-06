package com.tom.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val secretNumber=SecretNumber()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun check(view :View){
        var n=edNumber.text.toString().toInt()
        println("number: ${n}")
        Log.d("MainActivityDebugMsg","number: ${n}")
        Log.v("MainActivityVerboseMsg","number: ${n}")
        Log.i("MainActivityInformation","number: ${n}")
        Log.e("MainActivityErrorMsg","number: ${n}")
    }
}

package com.example.sh408.eventhandler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListener = MyRadiobuttonListener()

        radioButton_red.setOnClickListener(myListener)
        radioButton_blue.setOnClickListener(myListener)
    }

    inner class MyRadiobuttonListener : View.OnClickListener {
        override fun onClick(view: View) {
            when (view.id) {
                R.id.radioButton_red -> {
                    var s = radioButton_red.text
                    Toast.makeText(applicationContext,"$s 선택",Toast.LENGTH_SHORT).show()
                }
                R.id.radioButton_blue -> {
                    var s = radioButton_blue.text
                    Toast.makeText(applicationContext, "$s 선택", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}

package com.example.sh408.eventhandler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    var status_steak: Boolean = false
    var status_cheese: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun onCheckBoxClicked(view:View){
        val status:Boolean = (view as CheckBox).isChecked
        when (view.id) {
            R.id.checkBox_meat -> {
                status_steak = status
                val s: String = if (status) "스테이크를 선택합니다" else "스테이크를 취소합니다"
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
            }
            R.id.checkBox_cheese -> {
                status_cheese = status
                val s: String = if (status) "치즈를 추가합니다" else "치즈추가를 취소합니다"
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
            }
        }

    }
    fun onSelected(view:View){
        var s = StringBuilder()
        var s1 = if (status_steak) "스테이크 주문\n" else "스테이크 취소\n"
        s.append(s1)
        var s2 = if (status_cheese) "치즈 주문" else "치즈 취소"
        s.append(s2)
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show()
    }
}

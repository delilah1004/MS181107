package com.example.sh408.eventhandler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RatingBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBar.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener{
            override fun onRatingChanged(p0: RatingBar?, rating: Float, p2: Boolean) {
                Toast.makeText(applicationContext,"당신의 별점은 $rating",
                        Toast.LENGTH_SHORT)
                        .show()
            }
        })
        /*
        ratingBar.setOnRatingBarChangeListener { p0, rating, Boolean ->
            Toast.makeText(applicationContext,"당신의 별점은 $rating",
                    Toast.LENGTH_SHORT)
                    .show()
        }

       -> 람다를 사용한 코드 변형 / 코틀린의 장점을 최대한 살려서 코딩하는 방법! / 코드가 훨씬 간결해진다
        */
    }

}

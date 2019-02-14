package com.robertobalducci.habittrainer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = HabitsAdapter(getSampleHabits())
        /*
        tv_description.text = getString(R.string.drink_water_description)
        tv_title.text = getString(R.string.drink_water)
        iv_icon.setImageResource(R.drawable.water)
         */


    }
}

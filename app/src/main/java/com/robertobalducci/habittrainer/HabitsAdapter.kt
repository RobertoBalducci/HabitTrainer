package com.robertobalducci.habittrainer

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class HabitsAdapter(val habits: List<Habit>) : RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): HabitViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int = habits.size

    override fun onBindViewHolder(p0: HabitViewHolder, p1: Int) {
        TODO("not implemented")
    }

    class HabitViewHolder(val iv: View) : RecyclerView.ViewHolder(iv)

}
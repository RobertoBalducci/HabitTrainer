package com.robertobalducci.habittrainer

data class Habit(val title: String, val description: String, val image: Int)


fun getSampleHabits() : List<Habit> {
    return listOf(
            Habit(
                    "Go for a walk",
                    "a nice in the sun gets you ready for the day ahead",
                    R.drawable.walk
            ),
            Habit(
                    "Drink a glass a water",
                    "A Refreshing glass of water keep you hydrated",
                    R.drawable.water
            )
    )
}

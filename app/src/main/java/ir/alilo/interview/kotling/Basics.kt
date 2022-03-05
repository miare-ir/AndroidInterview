package ir.alilo.interview.kotling

import java.util.*


class Basics {
    fun filterWeirdDays(days: List<Day>): List<Day> {
        /**
         * A weird day is a day which total weirdness of its events exceeds WEIRD_DAY_THRESHOLD
         */
        // Q2: Can we make this function do what it says?
        return emptyList()
    }

    fun logBizarreDays(days: List<Day>) {
        /**
         * A bizarre event is an event which its weirdness exceeds BIZARRE_EVENT_THRESHOLD
         */
        // Q3: Let's log index of days with more than 2 bizarre events
    }

    fun compare(): Boolean {
        val day1 = Day(Date(0), listOf(Event(1, 0)))
        val day2 = Day(Date(0), listOf(Event(1, 0)))

        // Q5: What is the result of the following statement?
        // How can we change that without turning Day into a data class?
        return day1 == day2
    }

    fun <T> runIfDayIsInFuture(day: Day, runnable: Day.() -> T): T? {
        /**
         * Runs the given runnable if the given day is in future and returns the result
         * Otherwise returns null
         */
        // Q6: Can we turn this into an extension function and implement it?
        return null
    }

    // Q7: This is really buggy and messy, right? Can you beautify it?
    fun dayStart(d: Day?) {
        if (d!!.equals(null)) {print("wrong day" + d); return}
        for (ev in d.events!!) {
            if (ev.weirdness != null && ev.weirdness!! > 0) {
                print("Such a weird day")
            }
        }
        var string = ""
        for (ev in d.events) {
            string = string + ev
        }
        print(string)
    }
}

// Q4: Can we make sure no objects can be created with a weirdness larger than 10?
data class Event(val id: Int, var weirdness: Int? = 0)

class Day(val date: Date, val events: List<Event>?) {
    companion object {
        const val WEIRD_DAY_THRESHOLD = 20
        const val BIZARRE_EVENT_THRESHOLD = 10
    }
}

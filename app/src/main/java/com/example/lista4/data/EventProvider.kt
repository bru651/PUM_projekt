package com.example.lista4.data

import com.example.lista4.data.model.event

object EventProvider {

    val eventlist = mutableListOf<event>()

    fun gen(){
        // New Year
        eventlist.add(event("New Year", 1, 1))

        // Valentine's Day
        eventlist.add(event("Valentine's Day", 2, 14))

        // International Women's Day
        eventlist.add(event("International Women's Day", 3, 8))

        // Easter Sunday (date may vary)
        eventlist.add(event("Easter Sunday", 4, 17)) // Adjust the date as needed

        // Labor Day (May 1st)
        eventlist.add(event("Labor Day", 5, 1))

        // Constitution Day (May 3rd, Polish holiday)
        eventlist.add(event("Constitution Day", 5, 3))

        // Corpus Christi (date may vary)
        eventlist.add(event("Corpus Christi", 6, 16)) // Adjust the date as needed

        // Polish Independence Day (November 11th)
        eventlist.add(event("Independence Day (Poland)", 11, 11))

        // Christmas Eve
        eventlist.add(event("Christmas Eve", 12, 24))

        // Christmas
        eventlist.add(event("Christmas", 12, 25))

        // Second Christmas Day (December 26th, Polish holiday)
        eventlist.add(event("Second Christmas Day", 12, 26))

        // International Men's Day
        eventlist.add(event("International Men's Day", 11, 19))

        // Thanksgiving (fourth Thursday in November, US)
        eventlist.add(event("Thanksgiving", 11, 24)) // Adjust the date as needed

        // Hanukkah (date may vary)
        eventlist.add(event("Hanukkah", 12, 18)) // Adjust the date as needed

        // Kwanzaa (December 26th to January 1st)
        eventlist.add(event("Kwanzaa", 12, 26))

        // April Fools' Day
        eventlist.add(event("April Fools' Day", 4, 1))

        // Earth Day
        eventlist.add(event("Earth Day", 4, 22))

        // Star Wars Day (May the 4th)
        eventlist.add(event("Star Wars Day", 5, 4))

        // International Nurses Day
        eventlist.add(event("International Nurses Day", 5, 12))

        // World Environment Day
        eventlist.add(event("World Environment Day", 6, 5))

        // World Emoji Day
        eventlist.add(event("World Emoji Day", 7, 17))

        // International Cat Day
        eventlist.add(event("International Cat Day", 8, 8))

        // International Dog Day
        eventlist.add(event("International Dog Day", 8, 26))

        // International Literacy Day
        eventlist.add(event("International Literacy Day", 9, 8))

        // World Smile Day (first Friday in October)
        eventlist.add(event("World Smile Day", 10, 7)) // Adjust the date as needed

        // Halloween
        eventlist.add(event("Halloween", 10, 31))

        // World Kindness Day
        eventlist.add(event("World Kindness Day", 11, 13))

        // Cyber Monday (first Monday after Thanksgiving, US)
        eventlist.add(event("Cyber Monday", 11, 28)) // Adjust the date as needed

        // Giving Tuesday (first Tuesday after Thanksgiving, US)
        eventlist.add(event("Giving Tuesday", 11, 29)) // Adjust the date as needed

        // Human Rights Day
        eventlist.add(event("Human Rights Day", 12, 10))

        // Test
        eventlist.add(event("TEST", 1, 1))

        // Test
        eventlist.add(event("Wielki Piątek", 3, 25))

        // Zielone Świątki (another year)
        eventlist.add(event("Zielone Świątki", 5, 24))

        // Wszystkich Świętych
        eventlist.add(event("Wszystkich Świętych", 11, 1))

        // Wniebowzięcie Najświętszej Maryi Panny
        eventlist.add(event("Wniebowzięcie Najświętszej Maryi Panny", 8, 15))

        // Święto Konstytucji Trzeciego Maja
        eventlist.add(event("Święto Konstytucji Trzeciego Maja", 5, 3))

    }

    init {
        gen()
    }

}
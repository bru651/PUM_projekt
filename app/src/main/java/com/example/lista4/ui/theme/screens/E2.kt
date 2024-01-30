package com.example.lista4.ui.theme.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lista4.data.EventProvider
import java.time.LocalDate
@Composable
fun E2()
{
    val currentDate = LocalDate.now()
    val cday = currentDate.dayOfMonth
    val cmonth = currentDate.monthValue
    //val events = EventProvider.eventlist.sortedWith(compareBy({ it.month }, { it.day }))
    val events = EventProvider.eventlist.sortedWith(compareBy({ it.month < cmonth || (it.month == cmonth && it.day < cday) }, { it.month }, { it.day }))
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(text = "Events", modifier = Modifier.padding(10.dp).align(Alignment.CenterHorizontally),fontSize=26.sp)
        LazyColumn(
            modifier = Modifier.fillMaxWidth().height(600.dp)
        ) {

            items(events.size) { index ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.Yellow)
                        .height(80.dp)

                ) {


                    //lewygorny
                    Text(
                        text = events[index].content,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(8.dp),
                        fontSize = 26.sp
                    )

                    //prawydolny
                    Text(
                        text = "Month ${events[index].month} ",
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .padding(8.dp),
                    )



                    //lewydolny
                    Text(
                        text = "Day ${events[index].day}",
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .padding(8.dp)
                    )
                }
            }
        }



    }
}
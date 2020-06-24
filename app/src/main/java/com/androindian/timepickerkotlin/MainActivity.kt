package com.androindian.timepickerkotlin

import android.app.TimePickerDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var HH: Int=0
    var MM: Int=0
    var SS: Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        time.setOnClickListener {
            var calendar=Calendar.getInstance()
            HH=calendar.get(Calendar.HOUR)
            MM=calendar.get(Calendar.MINUTE)
            SS=calendar.get(Calendar.SECOND)

            val timePickerDialog=TimePickerDialog(
                    this@MainActivity,
                    TimePickerDialog.OnTimeSetListener {
                        view, hourOfDay, minute ->
                        showtime.setText(hourOfDay.toString()+":"+minute.toString())

                    },HH,MM,false)
            timePickerDialog.show()

        }
    }
}
package com.bitamirshafiee.widgetpracticeskeleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        age_text_view.text = String.format(resources.getString(R.string.str_age), 0)
        seek_bar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                age_text_view.text = String.format(resources.getString(R.string.str_age), progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

       ArrayAdapter.createFromResource(
            this,
            R.array.list_of_units,
            android.R.layout.simple_list_item_1).also{
                arrayAdapter ->   spinner.adapter = arrayAdapter
       }

    }
}
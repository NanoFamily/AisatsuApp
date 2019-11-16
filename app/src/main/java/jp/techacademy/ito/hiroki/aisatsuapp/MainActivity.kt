package jp.techacademy.ito.hiroki.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.app.TimePickerDialog
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        /*button2.setOnClickListener(this)*/
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        } /*else if (v.id == R.id.button2) {
            showTimePickerDialog()
        }*/
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
            },
            10, 20, true
        )
        timePickerDialog.show()
    }


    /*textView.text = "おはよう"
    textView.text = "こんにちは"
    textView.text = "こんばんは"*/

}
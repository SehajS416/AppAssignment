package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.BaseMmsColumns.MESSAGE_ID
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_display_message.*

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

       val textView=findViewById<TextView>(R.id.message_tv)
        val message= intent.getStringExtra("MESSAGE_ID")
        textView.text=message
        Toast.makeText(this, message,Toast.LENGTH_SHORT).show()


    }
}
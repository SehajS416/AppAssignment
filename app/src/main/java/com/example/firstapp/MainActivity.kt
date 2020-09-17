package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

      val MESSAGE_ID="MESSAGE_ID"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity_layout)
    }

    fun sendClicked(v: View) {
        val messageEditText=findViewById<EditText>(R.id.message_etv)
        val message=messageEditText.text.toString()
       // Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, DisplayMessageActivity::class.java)
        intent.putExtra(MESSAGE_ID,message)
        startActivity(intent)

    }
}









package com.example.intentstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var TextView_name=findViewById<TextView>(R.id.textView3);
        var TextView_phone=findViewById<TextView>(R.id.textView4);
        var intenter= intent ;
        var name :String?=intenter.getStringExtra("Name");
        var phone_number:Int= intenter.getIntExtra("phone_number",0);
        TextView_name.setText(name);
        TextView_phone.setText(phone_number.toString());
    }
}
package com.example.intentstart

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var TextView_name=findViewById<TextView>(R.id.textView3);
        var TextView_phone=findViewById<TextView>(R.id.textView4);
        var button_implicit=findViewById<Button>(R.id.button2);
        var intenter= intent ;
        var name :String?=intenter.getStringExtra("Name");
        var phone_number:Int= intenter.getIntExtra("phone_number",0);
        TextView_name.setText(name);
        TextView_phone.setText(phone_number.toString());
        button_implicit.setOnClickListener()
        {
          // val intent=Intent(this@SecondActivity,MainActivity::class.java);
            //startActivity(intent)

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("content://media/external/images/media/")
            startActivity(intent)
        }
    }
}
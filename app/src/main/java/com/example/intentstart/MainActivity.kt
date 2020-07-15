package com.example.intentstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val editText_name=findViewById<EditText>(R.id.editTextTextPersonName);
        val editText_phone=findViewById<EditText>(R.id.editTextPhone);
        val Button_move=findViewById<Button>(R.id.button);
        Button_move.setOnClickListener()
        {
            var name : String=editText_name.text.toString();
            var phone_number:Int=editText_phone.text.toString().toInt()
            if (name.trim().length>0 )
            {
                val intent=Intent(this@MainActivity,SecondActivity::class.java);
                intent.putExtra("Name",name);
                intent.putExtra("phone_number",phone_number);
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Please fill all these fields",Toast.LENGTH_SHORT).show();
            }
        }

    }
}
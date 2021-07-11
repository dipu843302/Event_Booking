package com.example.eventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText fname;
private EditText lname;
private EditText email;
private EditText mobile;
private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=findViewById(R.id.fname);
        lname=findViewById(R.id.lname);
        email=findViewById(R.id.email);
        mobile=findViewById(R.id.mob);
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=fname.getText().toString();
                String name2=lname.getText().toString();
                String emailid=email.getText().toString();
                String mob=mobile.getText().toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",name);
                intent.putExtra("name2",name2);
                intent.putExtra("emailid",emailid);
                intent.putExtra("mob",mob);
                startActivity(intent);
            }
        });
    }
}
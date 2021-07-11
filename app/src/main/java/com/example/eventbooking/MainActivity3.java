package com.example.eventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    private EditText fname;
    private EditText lname;
    private EditText email;
    private EditText mobile;
    private EditText date;
    private EditText seat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        fname=findViewById(R.id.fname3);
        lname=findViewById(R.id.lname3);
        email=findViewById(R.id.email3);
        mobile=findViewById(R.id.mob3);
        date=findViewById(R.id.date3);
        seat=findViewById(R.id.seat3);

        fname.setText(getIntent().getStringExtra("name"));
        lname.setText(getIntent().getStringExtra("name2"));
        email.setText(getIntent().getStringExtra("emailid"));
        mobile.setText(getIntent().getStringExtra("mob"));
        date.setText(getIntent().getStringExtra("datee"));
        seat.setText(getIntent().getStringExtra("datee"));

    }
}
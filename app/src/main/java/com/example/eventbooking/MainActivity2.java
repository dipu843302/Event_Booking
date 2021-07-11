package com.example.eventbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText fname;
    private EditText lname;
    private EditText email;
    private EditText mobile;
    private EditText date;
    private EditText seat;
    private Button conf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fname=findViewById(R.id.fname);
        lname=findViewById(R.id.lname);
        email=findViewById(R.id.email);
        mobile=findViewById(R.id.mob);
        date=findViewById(R.id.date);
        seat=findViewById(R.id.seat);
        conf=findViewById(R.id.confirm);

        fname.setText(getIntent().getStringExtra("name"));
        lname.setText(getIntent().getStringExtra("name2"));
        email.setText(getIntent().getStringExtra("emailid"));
        mobile.setText(getIntent().getStringExtra("mob"));
        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=fname.getText().toString();
                String name2=lname.getText().toString();
                String emailid=email.getText().toString();
                String mob=mobile.getText().toString();
                String seet=seat.getText().toString();
                String datee=date.getText().toString();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("name",name);
                intent.putExtra("name2",name2);
                intent.putExtra("emailid",emailid);
                intent.putExtra("mob",mob);
                intent.putExtra("seet",seet);
                intent.putExtra("datee",datee);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Booking confirmed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
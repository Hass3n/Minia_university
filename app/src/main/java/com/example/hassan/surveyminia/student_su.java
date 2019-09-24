package com.example.hassan.surveyminia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class student_su extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_su);
        bt1=findViewById(R.id.std_se1);
        bt2=findViewById(R.id.std_se2);
        bt3=findViewById(R.id.std_se3);
        bt4=findViewById(R.id.std_se4);
        bt5=findViewById(R.id.std_se5);
        bt6=findViewById(R.id.std_se6);
        bt7=findViewById(R.id.std_se7);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name=" https://www.minia.edu.eg/Minia/results.aspx";
                startActivity(new Intent(student_su.this,web.class));
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="https://www.minia.edu.eg/Minia/tables.aspx";
                startActivity(new Intent(student_su.this,web.class));
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="https://www.minia.edu.eg/Minia/Astudents.aspx";
                startActivity(new Intent(student_su.this,web.class));
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="https://www.minia.edu.eg/Minia/Astudents.aspx#";
                startActivity(new Intent(student_su.this,web.class));
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="https://www.minia.edu.eg/program/";
                startActivity(new Intent(student_su.this,web.class));
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="http://courses.minia.edu.eg/";
                startActivity(new Intent(student_su.this,web.class));
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="https://www.minia.edu.eg/Minia/deputy.aspx";
                startActivity(new Intent(student_su.this,web.class));
            }
        });
    }




}

package com.example.hassan.surveyminia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Universty extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universty);
        bt1=findViewById(R.id.un_se1);
        bt2=findViewById(R.id.un_se2);
        bt3=findViewById(R.id.un_se3);
        bt4=findViewById(R.id.un_se4);
        bt5=findViewById(R.id.un_se5);
        bt6=findViewById(R.id.un_se6);
        bt7=findViewById(R.id.un_se7);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="https://www.minia.edu.eg/Minia/history2.aspx";
                startActivity(new Intent(Universty.this,web.class));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="https://www.minia.edu.eg/Minia/values.aspx";
                startActivity(new Intent(Universty.this,web.class));
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="https://www.minia.edu.eg/Minia/vision.aspx";
                startActivity(new Intent(Universty.this,web.class));
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="http://mc.minia.edu.eg/buildings";
                startActivity(new Intent(Universty.this,web.class));
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="http://mc.minia.edu.eg/minialeaders/";
                startActivity(new Intent(Universty.this,web.class));
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="https://www.minia.edu.eg/Minia/Heads.aspx";
                startActivity(new Intent(Universty.this,web.class));
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.ul_name="https://www.minia.edu.eg/Minia/modawana1.aspx";
                startActivity(new Intent(Universty.this,web.class));
            }
        });





    }
}

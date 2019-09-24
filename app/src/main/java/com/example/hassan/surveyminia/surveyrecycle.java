package com.example.hassan.surveyminia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class surveyrecycle extends AppCompatActivity {

    GridView gridView;
    ArrayList<Item> items;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surveyrecycle);
        getItem();
        gridView=findViewById(R.id.grid);
        myAdapter=new MyAdapter(this,items);
        gridView.setAdapter(myAdapter);
        myAdapter.setOncatagoyItem(new MyAdapter.OncatagoyItem() {
            @Override
            public void oncatagoyitem(Item item, long postion) {
                if(item.getId()==0)
                {
                    web.ul_name="https://www.minia.edu.eg/myfawry/";
                    startActivity(new Intent(surveyrecycle.this,web.class));

                }

                else if(item.getId()==1)
                {

                    startActivity(new Intent(surveyrecycle.this,student_su.class));
                }

                else if(item.getId()==2)
                {

                    startActivity(new Intent(surveyrecycle.this,High_stu.class));
                }

                else if(item.getId()==3)
                {

                    web.ul_name="https://www.minia.edu.eg/Minia/media2.aspx?c_id=1";
                    startActivity(new Intent(surveyrecycle.this,web.class));
                }
                else if(item.getId()==4)
                {

                    startActivity(new Intent(surveyrecycle.this,Tec_su.class));
                }
                else if(item.getId()==5)
                {

                    startActivity(new Intent(surveyrecycle.this,en_act.class));
                }

                else if(item.getId()==6)
                {
                    web.ul_name="https://www.minia.edu.eg/Minia/complian2.aspx";
                    startActivity(new Intent(surveyrecycle.this,web.class));
                }


            }
        });
    }
    private void getItem() {
        items = new ArrayList<>();
        items.add(new Item("التحصيل الالكتروني", R.drawable.o,0));
        items.add(new Item("خدمات طلابية",  R.drawable.w,1));
        items.add(new Item("الدراسات العليا", R.drawable.z,2));
        items.add(new Item("اخبار الجامعة",  R.drawable.uv,3));//news
        items.add(new Item(" هيئة التدريس", R.drawable.a,4));
        items.add(new Item("قطاع شئون البيئة    ", R.drawable.uv,5));
        items.add(new Item("  شكاوى ومقترحات   ", R.drawable.t,6));

    }

}

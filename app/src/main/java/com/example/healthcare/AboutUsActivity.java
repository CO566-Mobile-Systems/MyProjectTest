package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class AboutUsActivity extends AppCompatActivity {
    private  String[][] health_details =
            {
                    {"Oral Health and Disease", "", "", "", "Click More Details"},
                    {"8 oral Hygiene Habits to Keep", "", "", "", "Click More Details"},
            };
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    ListView lst;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        btnBack = findViewById(R.id.buttonCUBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutUsActivity.this, HomeActivity.class));
            }
        });

        list =new ArrayList();
        for(int i=0;i<health_details.length;i++){
            item= new HashMap<String,String>();
            item.put("line1", health_details[i][0]);
            item.put("line2", health_details[i][1]);
            list.add(item);
        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2"},
                new int[]{R.id.line_a});
        ListView lst = findViewById(R.id.listViewHA);
        lst.setAdapter(sa);

    }
}
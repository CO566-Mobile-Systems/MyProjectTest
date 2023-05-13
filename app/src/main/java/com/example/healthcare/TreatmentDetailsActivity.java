package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class TreatmentDetailsActivity extends AppCompatActivity {

    private String[][] treatments = {
            {"Examination and Diagnosis", "£75.00"},
            {"Filling", "£90.00 to £150.00"},
            {"Extraction", "£140.00 to £330.00"},
            {"Root Canal", "£285.00 to £550.00"},
            {"Periodontal Care", "£50.00 to £450.00"},
            {"Implants", "£2500.00 to £6000.00"}
    };

    private ArrayList<HashMap<String, String>> list = new ArrayList<>();
    private HashMap<String, String> item;
    private SimpleAdapter sa;
    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment_details);

        ListView lst = findViewById(R.id.listViewHA);
        buttonBack = findViewById(R.id.buttonTMBack);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TreatmentDetailsActivity.this, HomeActivity.class));
            }
        });

        for(int i = 0; i < treatments.length; i++) {
            item = new HashMap<>();
            item.put("treatment", treatments[i][0]);
            item.put("price", treatments[i][1]);
            list.add(item);
        }

        sa = new SimpleAdapter(this, list,
                R.layout.treatment_item,
                new String[]{"treatment", "price"},
                new int[]{R.id.tv_treatment, R.id.tv_price});

        lst.setAdapter(sa);
    }
}
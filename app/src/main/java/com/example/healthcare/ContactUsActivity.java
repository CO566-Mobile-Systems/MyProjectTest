package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class ContactUsActivity extends AppCompatActivity {
    private  String[][] contactus_details =
            {
                    {"Dental care practitioners are professionals who specialise in providing dental" +
                            " care services to patients, including diagnosing and treating " +
                            "various dental problems, performing dental procedures such as fillings," +
                            " extractions, and cleanings, and educating patients about oral " +
                            "hygiene and preventative dental care.These professionals are essential " +
                            "to maintaining good oral health and preventing dental problems, such as cavities, " +
                            "gum disease, and tooth loss.These professionals are essential to maintaining good oral " +
                            "health and preventing dental problems, such as cavities, gum disease, and tooth loss. ",""},
            };
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    ListView lst;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        lst = findViewById(R.id.listViewHA);
        btnBack = findViewById(R.id.buttonAUBack);
    }
}
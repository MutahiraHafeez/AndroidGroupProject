package com.example1.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView pdfListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfListView=(ListView)findViewById(R.id.Surah_Names);

        String [] pdfFileNames={"Surah Kahf","Sural Mulk","Surah Ar Rehman","Surah Waqiah","Surah Yaseen","Surah Taubah"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>()

    }
}

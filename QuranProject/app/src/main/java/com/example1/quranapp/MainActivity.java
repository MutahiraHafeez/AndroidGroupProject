package com.example1.quranapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView pdfListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfListView=(ListView)findViewById(R.id.Surah_Names);

        String [] pdfFileNames={"Surah Kahf","Sural Mulk","Surah Ar Rehman","Surah Waqiah","Surah Yaseen","Surah Taubah"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pdfFileNames)
        {

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view=super.getView(position, convertView, parent);
                TextView textView= (TextView) view.findViewById(android.R.id.text1);

                return view ;
            }
        };

        pdfListView.setAdapter(adapter);

        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = pdfListView.getItemAtPosition(position).toString();
                Intent intent = new Intent(getApplicationContext(),PdfOpener.class);
                intent.putExtra("fileName",item);
                startActivity(intent);
            }
        });
    }
}

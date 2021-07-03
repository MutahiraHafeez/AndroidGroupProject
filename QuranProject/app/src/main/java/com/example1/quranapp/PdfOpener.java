package com.example1.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfOpener extends AppCompatActivity {
PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_opener);

        pdfView=(PDFView)findViewById(R.id.opener);
        String getitem=getIntent().getStringExtra("filename");
        if(getitem.equals("Surah Kahf"))
        {
            pdfView.fromAsset("Surah-Kahf-in-Arabic").load();
        }
        else if(getitem.equals("Sural Mulk"))
        {
            pdfView.fromAsset("Surah-Mulk-in-Arabic.pdf").load();
        }
        else if(getitem.equals("Surah Ar Rehman"))
        {
            pdfView.fromAsset("Surah-Rahman-in-Arabic.pdf").load();
        }
        else if(getitem.equals("Surah Waqiah"))
        {
            pdfView.fromAsset("Surah-Waqiah-in-Arabic.pdf").load();
        }
        else if(getitem.equals("Surah Yaseen"))
        {
            pdfView.fromAsset("Surah-Yaseen-in-Arabic.pdf").load();
        }
        else if(getitem.equals("Surah Taubah"))
        {
            pdfView.fromAsset("Surah-Taubah-in-Arabic.pdf").load();
        }
    }
}
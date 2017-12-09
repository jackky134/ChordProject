package com.example.nnnnew.chordproject;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

// หน้าคอร์ดเพลง

public class ChordActivity extends AppCompatActivity {

    String imgChord;
    private DBChord dbChord;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chord);

        dbChord = new DBChord(getApplicationContext());
        db = dbChord.getWritableDatabase();

        Intent intent = getIntent();
        imgChord = intent.getStringExtra("imgChord");
        System.out.print(imgChord);
        String imgFileName = imgChord.substring(0, imgChord.indexOf("."));
        ImageView imgView = (ImageView) findViewById(R.id.chord_img);
        System.out.println(imgFileName);
        int imgId = getApplicationContext().getResources().getIdentifier("drawable/" + imgFileName, null, getApplicationContext().getPackageName());
        imgView.setImageResource(imgId);

        //System.out.println(getImgChord(id));
    }

}



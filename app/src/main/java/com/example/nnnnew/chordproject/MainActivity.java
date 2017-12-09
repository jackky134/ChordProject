package com.example.nnnnew.chordproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

// หน้าหลัก

public class MainActivity extends AppCompatActivity {

    private DBChord dbChord;
    private SQLiteDatabase db;
    private ListView list;
    private ArrayList<Song> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbChord = new DBChord(getApplicationContext());
        db = dbChord.getWritableDatabase();

        songs = new ArrayList<Song>();
        queryDataFromDB();
        MainSongAdapter mainSongAdapter = new MainSongAdapter(this, R.layout.song_detail, songs);

        list = (ListView) findViewById(R.id.song_listview);
        list.setAdapter(mainSongAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ChordActivity.class);
                System.out.println(songs.get(position).getImgChord());
                intent.putExtra("imgChord", songs.get(position).getImgChord());
                startActivity(intent);
            }
        });

    }

    // ดึงข้อมูลทั้งหมดจากดาต้าเบส
    private void queryDataFromDB() {
        String selectQuery = "SELECT " +
                DBChord.COL_ID + "," +
                DBChord.COL_SONG + "," +
                DBChord.COL_SINGER + "," +
                DBChord.COL_CHORD +
                " FROM " + DBChord.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectQuery, null);
        while(cursor.moveToNext()) {
            String songName = cursor.getString(cursor.getColumnIndex(DBChord.COL_SONG));
            String singerName = cursor.getString(cursor.getColumnIndex(DBChord.COL_SINGER));
            String imgChord = cursor.getString(cursor.getColumnIndex(DBChord.COL_CHORD));
            Long _id = cursor.getLong(cursor.getColumnIndex(DBChord.COL_ID));
            Song newSong = new Song(songName, singerName, imgChord, _id);
            songs.add(newSong);
        }
    }
}

package com.example.nnnnew.chordproject;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nnnnew on 6/12/2017 AD.
 */

// Adapter สำหรับแสดงรานการเพลงหน้าหลัก

public class MainSongAdapter extends ArrayAdapter<Song> {
    private Context context;
    private int itemLayoutID;
    private ArrayList<Song> songs;

    public MainSongAdapter(Context context, int itemLayoutID, ArrayList<Song> song) {
        super(context,itemLayoutID, song);

        this.itemLayoutID = itemLayoutID;
        this.songs = song;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View item = inflater.inflate(itemLayoutID, parent, false);
        TextView songText = (TextView) item.findViewById(R.id.songName);
        TextView singerName = (TextView) item.findViewById(R.id.singerName);

        Song song = songs.get(position);
        songText.setText(song.getSongName());
        singerName.setText(song.getSingerName());

        return item;
    }
}

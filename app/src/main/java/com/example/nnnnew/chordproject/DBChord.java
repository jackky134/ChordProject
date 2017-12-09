package com.example.nnnnew.chordproject;


import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

/**
 * Created by nnnnew on 5/12/2017 AD.
 */

public class DBChord extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "chord.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "chordsong";
    public static final String COL_ID = "_id";
    public static final String COL_SINGER = "singer";
    public static final String COL_SONG = "song";
    public static final String COL_CHORD = "chord_img";


    public DBChord(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreateTable = "CREATE TABLE %s (" +
                "%s INTEGER PRIMARY KEY AUTOINCREMENT," +
                "%s TEXT," +
                "%s TEXT," +
                "%s TEXT)";
        sqlCreateTable = String.format(sqlCreateTable, TABLE_NAME, COL_ID, COL_SINGER, COL_SONG, COL_CHORD);
        db.execSQL(sqlCreateTable);


        // เพิ่มข้อมูลเริ่มต้นลงในดาต้าเบส
        ContentValues cv = new ContentValues();
        cv.put(DBChord.COL_SINGER, "Bodyslam");
        cv.put(DBChord.COL_SONG, "ยาพิษ");
        cv.put(DBChord.COL_CHORD, "song1.png");
        db.insert(DBChord.TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(DBChord.COL_SINGER, "Potato");
        cv.put(DBChord.COL_SONG, "ที่เดิม");
        cv.put(DBChord.COL_CHORD, "song2.png");
        db.insert(DBChord.TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(DBChord.COL_SINGER, "Clash");
        cv.put(DBChord.COL_SONG, "ยิ้มเข้าไว้");
        cv.put(DBChord.COL_CHORD, "song3.png");
        db.insert(DBChord.TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(DBChord.COL_SINGER, "Big Ass");
        cv.put(DBChord.COL_SONG, "เล่นของสูง");
        cv.put(DBChord.COL_CHORD, "song4.png");
        db.insert(DBChord.TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(DBChord.COL_SINGER, "Basher");
        cv.put(DBChord.COL_SONG, "ฟ้า");
        cv.put(DBChord.COL_CHORD, "song5.png");
        db.insert(DBChord.TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(DBChord.COL_SINGER, "Instinct");
        cv.put(DBChord.COL_SONG, "โปรดส่งใครมารักฉันที ");
        cv.put(DBChord.COL_CHORD, "song6.png");
        db.insert(DBChord.TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(DBChord.COL_SINGER, "Tattoo Colour");
        cv.put(DBChord.COL_SONG, "โกหก");
        cv.put(DBChord.COL_CHORD, "song7.png");
        db.insert(DBChord.TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(DBChord.COL_SINGER, "Playground");
        cv.put(DBChord.COL_SONG, "ปล่อยวาง");
        cv.put(DBChord.COL_CHORD, "song8.png");
        db.insert(DBChord.TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(DBChord.COL_SINGER, "Zeal");
        cv.put(DBChord.COL_SONG, "สองรัก");
        cv.put(DBChord.COL_CHORD, "song9.png");
        db.insert(DBChord.TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(DBChord.COL_SINGER, "Arm Chair");
        cv.put(DBChord.COL_SONG, "รักแท้");
        cv.put(DBChord.COL_CHORD, "song10.png");
        db.insert(DBChord.TABLE_NAME, null, cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

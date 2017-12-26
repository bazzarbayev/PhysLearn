package com.example.physlearn;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DBHelperResult extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "physlearn_result";
    // tasks table name
    private static final String TABLE_RESULT = "physlearn_result";
    // tasks Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_DATE = "date"; //correct option
    private static final String KEY_RESULT = "result"; //option a
    private SQLiteDatabase dbase;
    private Context context;

    public DBHelperResult(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
        dbase = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase=db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_RESULT + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_NAME
                + " TEXT, " + KEY_DATE + " TEXT, " + KEY_RESULT +" TEXT)";
        db.execSQL(sql);
        //addQuestions();
        //db.close();
    }
    public void addQuestions(Result result)
    {
        //Result result = new Result("Name","Date","5");
        this.addQuestion(result);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RESULT);
        Log.d("sql","drop table if exists"+TABLE_RESULT);
        onCreate(db);
    }
    public  void updateText(String getNAME, String getDate, String oldTime){
        SQLiteDatabase database = getWritableDatabase();
        String sql = "update "+TABLE_RESULT+" set "+KEY_NAME+" = '"+getNAME+"' , "+KEY_DATE +" = '"+getDate +"' where "+KEY_DATE+"= '"+ oldTime+"' ;";
        Log.d("sql", sql);
        database.execSQL(sql);
        database.close();}
    // Adding new question
    public void addQuestion(Result result) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_NAME, result.getNAME());
        contentValues.put(KEY_DATE, result.getDATE());
        contentValues.put(KEY_RESULT, result.getRESULT());
        // Inserting Row
        dbase.insert(TABLE_RESULT, null, contentValues);

//        String sql = "INSERT INTO" + TABLE_RESULT + " VALUES ( "
//                + KEY_ID + " , " + result.getNAME().toString()
//                + " , " + result.getDATE().toString() + " , " + result.getRESULT().toString() +" )";
//        dbase.execSQL(sql);
    }

    public List<Result> getAllResults() {
        List<Result> results = new ArrayList<Result>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_RESULT;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Result result = new Result();
                result.setID(cursor.getInt(0));
                result.setNAME(cursor.getString(1));
                result.setDATE(cursor.getString(2));
                result.setRESULT(cursor.getString(3));
                results.add(result);
            } while (cursor.moveToNext());
        }
        // return quest list
        return results;
    }
    public int rowcount()
    {
        int row = 0;
        String selectQuery = "SELECT  * FROM " + TABLE_RESULT;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row = cursor.getCount();
        return row;
    }

    public Context getContext() {
        return context;
    }
    public void deleteQuestions(String getDate){
        SQLiteDatabase database = getWritableDatabase();
        String sql = "delete from "+TABLE_RESULT+" where "+KEY_DATE+"= '"+ getDate+"' ;";
        database.execSQL(sql);
        database.close();
    }
}
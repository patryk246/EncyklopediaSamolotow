package com.example.prototyp4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper{
    private Context context;

    public DatabaseHelper(Context context) {
        super(context, DatabaseContract.DATABASE_NAME, null, DatabaseContract.DATABASE_VERSION);
        this.context = context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
            db.execSQL(DatabaseContract.TempHistory.CREATE_TABLE);
            addData("b787", "local", "Boeing 787 descreiption lorel ipsum bla bla bla");
            //addData("b29", "militar", "B29 description asdadsfasdfasdf asdf um bla bla bla");
            //addData("cc2", "militar", "CC22 descreiption lorel ipsum bla bla bla");
        }catch (SQLException e){
            Toast.makeText(context, ""+e, Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try{
            db.execSQL(DatabaseContract.TempHistory.DELETE_TABLE);
            onCreate(db);
        }catch (SQLException e){
            Toast.makeText(context, ""+e, Toast.LENGTH_LONG).show();
        }

    }

    public String getInfo(String name){
        SQLiteDatabase db = this.getReadableDatabase();
        String result = "";
        try {
            String[] columns = {DatabaseContract.TempHistory.COLUMN_NAME_DESCRIPTION};
            Cursor cursor = db.query(DatabaseContract.TempHistory.TABLE_NAME,
                    columns, DatabaseContract.TempHistory.COLUMN_NAME_NAME+" = '"+name+"'",
                    null, null, null, null
            );
            while (cursor.moveToFirst()) {
                int index = cursor.getColumnIndex(DatabaseContract.TempHistory.COLUMN_NAME_DESCRIPTION);
                result = cursor.getString(index);
            }
            return result;

        }catch (SQLException e){
            Toast.makeText(context, ""+e, Toast.LENGTH_LONG).show();
            return ""+e;
        }

        }


    public long addData(String name, String category, String description){
        SQLiteDatabase db = this.getWritableDatabase();
        try{
            ContentValues contentValues = new ContentValues();
            contentValues.put(DatabaseContract.TempHistory.COLUMN_NAME_NAME, name);
            contentValues.put(DatabaseContract.TempHistory.COLUMN_NAME_CATEGORY, category);
            contentValues.put(DatabaseContract.TempHistory.COLUMN_NAME_DESCRIPTION, description);

            long result = db.insert(DatabaseContract.TempHistory.TABLE_NAME, null, contentValues);
            return result;
        }catch (SQLException e){
            Toast.makeText(context, ""+e, Toast.LENGTH_LONG).show();

        }
        return -1;

    }

}


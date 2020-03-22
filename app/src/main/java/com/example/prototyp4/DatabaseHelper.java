package com.example.prototyp4;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper{

    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DatabaseContract.DATABASE_NAME, null, DatabaseContract.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL(DatabaseContract.TempHistory.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DatabaseContract.TempHistory.DELETE_TABLE);
        onCreate(db);
    }

    public long addData(String name, String category, String description){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseContract.TempHistory.COLUMN_NAME_NAME, name);
        contentValues.put(DatabaseContract.TempHistory.COLUMN_NAME_CATEGORY, category);
        contentValues.put(DatabaseContract.TempHistory.COLUMN_NAME_DESCRIPTION, description);

        long result = db.insert(DatabaseContract.TempHistory.TABLE_NAME, null, contentValues);
              return result;

    }
}


package com.example.prototyp4;

import android.provider.BaseColumns;

public class DatabaseContract {
    public DatabaseContract() {

    }
        public static final int DATABASE_VERSION = 1;
        public static final String DATABASE_NAME = "encyklopedia.db";
        private static final String TEXT_TYPE = " TEXT";
        private static final String COMMA_SEP = ",";
        /* Inner class that defines the table contents */
        public static abstract class TempHistory implements BaseColumns {
            public static final String TABLE_NAME = "table";
            public static final String COLUMN_NAME_NAME = "name";
            public static final String COLUMN_NAME_CATEGORY = "category";
            public static final String COLUMN_NAME_DESCRIPTION = "description";
            public static final String CREATE_TABLE = "CREATE TABLE " +
                    TABLE_NAME + " (" + _ID + " INTEGER PRIMARY KEY," +
                    COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP + COLUMN_NAME_CATEGORY +
                    TEXT_TYPE + COMMA_SEP + COLUMN_NAME_DESCRIPTION +
                    TEXT_TYPE + ")";
            public static final String DELETE_TABLE = "DROP TABLE IF EXISTS"
                    + TABLE_NAME;
        }
}
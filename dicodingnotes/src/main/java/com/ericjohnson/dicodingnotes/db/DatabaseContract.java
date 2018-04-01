package com.ericjohnson.dicodingnotes.db;

import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by EricJohnson on 3/25/2018.
 */

public class DatabaseContract {

    public static final String TABLE_NOTE = "note";

    public static final class NoteColumns implements BaseColumns {

        public static final String TITLE = "title";

        public static final String DESCRIPTION = "description";

        public static final String DATE = "date";
    }

    // Authority yang digunakan
    public static final String AUTHORITY = "com.ericjohnson.mynotesapp";

    // Base content yang digunakan untuk akses content provider
    public static final Uri CONTENT_URI = new Uri.Builder().scheme("content")
            .authority(AUTHORITY)
            .appendPath(TABLE_NOTE)
            .build();

    public static String getColumnString(Cursor cursor, String columnName) {
        return cursor.getString( cursor.getColumnIndex(columnName) );
    }

    public static int getColumnInt(Cursor cursor, String columnName) {
        return cursor.getInt( cursor.getColumnIndex(columnName) );
    }

    public static long getColumnLong(Cursor cursor, String columnName) {
        return cursor.getLong( cursor.getColumnIndex(columnName) );
    }
}

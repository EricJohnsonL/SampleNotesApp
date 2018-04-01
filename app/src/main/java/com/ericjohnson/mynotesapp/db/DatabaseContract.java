package com.ericjohnson.mynotesapp.db;

import android.provider.BaseColumns;

/**
 * Created by EricJohnson on 3/25/2018.
 */

public class DatabaseContract {

    static final String TABLE_NOTE = "note";

    static final class NoteColumns implements BaseColumns {

        static final String TITLE = "title";

        static final String DESCRIPTION = "description";

        static final String DATE = "date";
    }
}

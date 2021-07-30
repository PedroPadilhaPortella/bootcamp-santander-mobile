package pedro.kadjin.contentprovider.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns._ID

class NotesDatabaseHelper(
    context: Context
): SQLiteOpenHelper(context, "db_notes", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE $TABLE_NAME " +
                "($_ID INTEGER NOT NULL PRIMARY KEY, " +
                "$TITLE_FIELD TEXT NOT NULL, " +
                "$DESCRIPTION_FIELD TEXT NOT NULL)"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    companion object {
        const val TABLE_NAME: String = "Notes"
        const val TITLE_FIELD: String = "title"
        const val DESCRIPTION_FIELD: String = "description"
    }
}
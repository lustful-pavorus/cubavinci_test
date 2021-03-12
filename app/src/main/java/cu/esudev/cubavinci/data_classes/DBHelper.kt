package cu.esudev.cubavinci.data_classes

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import cu.esudev.cubavinci.MainActivity

class DBHelper(var dbName:String, val version:Int) : SQLiteOpenHelper(null,dbName,null,version) {
    companion object{
        val TABLE_EXERCISES = "exercises"
        val TABLE_TESTS = "tests"
        val TABLE_TOPICS = "topics"
    }

    private val tag = "DbHelper"

    private val createTableExercises = """
        CREATE TABLE "Exercise" (
        	"id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
        	"content"	TEXT,
        	"test_id"	INTEGER,
        	"topic_id"	INTEGER
        );
    """.trimIndent()

    private val createTableTopic = """
        CREATE TABLE "Topic" (
        	"id"	INTEGER NOT NULL UNIQUE,
        	"name"	TEXT NOT NULL,
        	PRIMARY KEY("id")
        );
    """.trimIndent()

    private val createTableTests = """
        CREATE TABLE "Test" (
        	"id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
        	"year"	INTEGER NOT NULL,
        	"convocatory"	INTEGER NOT NULL,
        	"locked"	INTEGER NOT NULL
        );
    """.trimIndent()

    override fun onCreate(db: SQLiteDatabase) {
        Log.d(tag, "Database [ CREATING ]")
        db.execSQL(createTableTests)
        db.execSQL(createTableTopic)
        db.execSQL(createTableExercises)
        Log.d(tag, "Database [ CREATED ]")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}
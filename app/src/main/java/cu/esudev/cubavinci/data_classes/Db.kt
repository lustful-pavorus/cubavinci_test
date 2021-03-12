package cu.esudev.cubavinci.data_classes

import java.lang.StringBuilder

object Db {
    private val tag = "Db"
    private val version = 1
    private val name = "test"

    val EXERCISE = object : CRUD<Exercise>{
        override fun select(args: Pair<String, String>): List<Exercise> = select(listOf(args))

        override fun select(args: Collection<Pair<String, String>>): List<Exercise> {
            val db = DBHelper(name, version).writableDatabase
            val selection = StringBuilder()
            val selectionArgs = mutableListOf<String>()
            args.forEach(){
                arg -> selection.append("${arg.first}")
                selectionArgs.add(arg.second)
            }
            val result = mutableListOf<Exercise>()
            val cursor = db.query(
                    true,
                    DBHelper.TABLE_EXERCISES,
                    null,
                    selection.toString(),
                    selectionArgs.toTypedArray(),
                    null,null,null,null
            )
            while(cursor.moveToNext()){

            }
            cursor.close()
            return result
        }

        override fun selectAll(): List<Exercise> {
            TODO("Not yet implemented")
        }

    }
    val TOPIC = object : CRUD<Topic>{
        //TODO(reason:not_implemented_yet)
    }
    val TEST = object : CRUD<Test>{
        //TODO(reason:not_implemented_yet)
    }"""
}
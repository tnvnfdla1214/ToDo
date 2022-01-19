package com.example.todo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database( entities = [ToDoEntity::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {

    companion object {
        const val DB_NAME = "ToDoDataBase.db"
    }

    abstract fun toDoDao(): ToDoDao

}

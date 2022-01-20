package com.example.todo.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todo.data.local.db.dao.ToDoDao
import com.example.todo.data.entitiy.ToDoEntity

@Database( entities = [ToDoEntity::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {

    companion object {
        const val DB_NAME = "ToDoDataBase.db"
    }

    abstract fun toDoDao(): ToDoDao

}

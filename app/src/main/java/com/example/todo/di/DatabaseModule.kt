package com.example.todo.di

import android.content.Context
import androidx.room.Room
import com.example.todo.data.local.db.ToDoDatabase
import com.example.todo.data.local.db.dao.ToDoDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun providesToDoDao(todoDatabase: ToDoDatabase): ToDoDao = todoDatabase.toDoDao()

    @Provides
    @Singleton
    fun providesTODoDatabase(@ApplicationContext context: Context): ToDoDatabase
            = Room.databaseBuilder(context, ToDoDatabase::class.java,"ToDoDatabase").build()
}
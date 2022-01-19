package com.example.todo

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.InternalCoroutinesApi
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)//ApplicationComponent::class > Hilt가 2.31으로 업데이트 이후 사라짐
class AppModule  {

    @Provides
    fun providesToDoDao(todoDatabase: ToDoDatabase):ToDoDao = todoDatabase.toDoDao()

    @Provides
    @Singleton
    fun providesTODoDatabase(@ApplicationContext context: Context):ToDoDatabase
            = Room.databaseBuilder(context,ToDoDatabase::class.java,"ToDoDatabase").build()

    @Provides
    fun providesUserRepository(todoDao: ToDoDao) : ToDoRepository
            = ToDoRepository(todoDao)
}
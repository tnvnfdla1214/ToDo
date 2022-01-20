package com.example.todo.di

import android.content.Context
import androidx.room.Room
import com.example.todo.data.local.db.dao.ToDoDao
import com.example.todo.data.local.db.ToDoDatabase
import com.example.todo.data.repository.ToDoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Qualifier
import javax.inject.Singleton
/*
@Module
@InstallIn(ApplicationComponent::class)//ApplicationComponent::class > Hilt가 2.31으로 업데이트 이후 사라짐
class AppModule  {

    @Provides
    fun providesToDoDao(todoDatabase: ToDoDatabase): ToDoDao = todoDatabase.toDoDao()

    @Provides
    @Singleton
    fun providesTODoDatabase(@ApplicationContext context: Context): ToDoDatabase
            = Room.databaseBuilder(context, ToDoDatabase::class.java,"ToDoDatabase").build()

    @Provides
    fun providesUserRepository(todoDao: ToDoDao) : ToDoRepository
            = ToDoRepository(todoDao)
}
 */
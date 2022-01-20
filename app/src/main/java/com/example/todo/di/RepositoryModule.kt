package com.example.todo.di

import com.example.todo.data.local.db.dao.ToDoDao
import com.example.todo.data.repository.ToDoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.CoroutineDispatcher

@Module
@InstallIn(ViewModelComponent::class)
class RepositoryModule {

    @Provides
    @ViewModelScoped
    fun providesUserRepository(todoDao: ToDoDao,coroutineDispatcher: CoroutineDispatcher) : ToDoRepository
            = ToDoRepository(todoDao,coroutineDispatcher)
}
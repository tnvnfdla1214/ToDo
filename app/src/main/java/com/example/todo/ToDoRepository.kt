package com.example.todo


import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ToDoRepository @Inject constructor (
    private val toDoDao: ToDoDao,
){

    suspend fun getToDoList(): List<ToDoEntity> = withContext(Dispatchers.IO) {
        toDoDao.getAll()
    }

    suspend fun getToDoItem(id: Long): ToDoEntity? = withContext(Dispatchers.IO) {
        toDoDao.getById(id)
    }

    suspend fun insertToDoItem(toDoEntity: ToDoEntity): Long = withContext(Dispatchers.IO) {
        toDoDao.insert(toDoEntity)
    }

    suspend fun insertToDoList(toDoList: List<ToDoEntity>) = withContext(Dispatchers.IO) {
        toDoDao.insert(toDoList)
    }

    suspend fun updateToDoItem(toDoEntity: ToDoEntity) = withContext(Dispatchers.IO) {
        toDoDao.update(toDoEntity)
    }

    suspend fun deleteToDoItem(id: Long) = withContext(Dispatchers.IO) {
        toDoDao.delete(id)
    }

    suspend fun deleteAll() = withContext(Dispatchers.IO) {
        toDoDao.deleteAll()
    }

}

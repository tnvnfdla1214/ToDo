package com.example.todo.data.repository


import com.example.todo.data.entitiy.ToDoEntity
import com.example.todo.data.local.db.dao.ToDoDao
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

class ToDoRepository @Inject constructor (
    private val toDoDao: ToDoDao,
    private val ioDispatcher: CoroutineDispatcher
):Repository{

    suspend fun getToDoList(): List<ToDoEntity> = withContext(ioDispatcher) {
        toDoDao.getAll()
    }

    suspend fun getToDoItem(id: Long): ToDoEntity? = withContext(ioDispatcher) {
        toDoDao.getById(id)
    }

    suspend fun insertToDoItem(toDoEntity: ToDoEntity): Long = withContext(ioDispatcher) {
        toDoDao.insert(toDoEntity)
    }

    suspend fun insertToDoList(toDoList: List<ToDoEntity>) = withContext(ioDispatcher) {
        toDoDao.insert(toDoList)
    }

    suspend fun updateToDoItem(toDoEntity: ToDoEntity) = withContext(ioDispatcher) {
        toDoDao.update(toDoEntity)
    }

    suspend fun deleteToDoItem(id: Long) = withContext(ioDispatcher) {
        toDoDao.delete(id)
    }

    suspend fun deleteAll() = withContext(ioDispatcher) {
        toDoDao.deleteAll()
    }

}

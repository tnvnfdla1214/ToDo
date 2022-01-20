package com.example.todo.domain.usecase

import com.example.todo.data.entitiy.ToDoEntity
import com.example.todo.data.repository.ToDoRepository
import javax.inject.Inject


internal class InsertToDoUseCase @Inject constructor(
    private val toDoRepository: ToDoRepository
){

    suspend operator fun invoke(toDoEntity: ToDoEntity): Long {
        return toDoRepository.insertToDoItem(toDoEntity)
    }

}

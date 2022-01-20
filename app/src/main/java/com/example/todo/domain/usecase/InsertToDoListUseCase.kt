package com.example.todo.domain.usecase

import com.example.todo.data.entitiy.ToDoEntity
import com.example.todo.data.repository.ToDoRepository
import javax.inject.Inject


internal class InsertToDoListUseCase @Inject constructor(
    private val toDoRepository: ToDoRepository
){

    suspend operator fun invoke(toDoList: List<ToDoEntity>) {
        return toDoRepository.insertToDoList(toDoList)
    }

}

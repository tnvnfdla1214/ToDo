package com.example.todo.domain.todo

import com.example.todo.ToDoEntity
import com.example.todo.ToDoRepository
import javax.inject.Inject


internal class InsertToDoListUseCase @Inject constructor(
    private val toDoRepository: ToDoRepository
){

    suspend operator fun invoke(toDoList: List<ToDoEntity>) {
        return toDoRepository.insertToDoList(toDoList)
    }

}

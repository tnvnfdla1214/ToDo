package com.example.todo.domain.todo

import com.example.todo.ToDoEntity
import com.example.todo.ToDoRepository
import javax.inject.Inject


internal class GetToDoItemUseCase @Inject constructor(
    private val toDoRepository: ToDoRepository
){

    suspend operator fun invoke(id: Long): ToDoEntity? {
        return toDoRepository.getToDoItem(id)
    }

}

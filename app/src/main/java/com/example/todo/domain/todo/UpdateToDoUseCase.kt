package com.example.todo.domain.todo

import com.example.todo.ToDoEntity
import com.example.todo.ToDoRepository
import javax.inject.Inject


internal class UpdateToDoUseCase @Inject constructor(
    private val toDoRepository: ToDoRepository
){

    suspend operator fun invoke(toDoEntity: ToDoEntity) {
        return toDoRepository.updateToDoItem(toDoEntity)
    }

}

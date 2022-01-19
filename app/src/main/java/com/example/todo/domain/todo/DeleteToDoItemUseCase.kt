package com.example.todo.domain.todo


import com.example.todo.ToDoRepository
import javax.inject.Inject

internal class DeleteToDoItemUseCase @Inject constructor(
    private val toDoRepository: ToDoRepository
){

    suspend operator fun invoke(id: Long) {
        return toDoRepository.deleteToDoItem(id)
    }

}

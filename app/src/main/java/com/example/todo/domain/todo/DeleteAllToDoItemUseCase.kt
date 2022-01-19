package com.example.todo.domain.todo


import com.example.todo.ToDoRepository
import javax.inject.Inject

internal class DeleteAllToDoItemUseCase @Inject constructor(
    private val toDoRepository: ToDoRepository
){

    suspend operator fun invoke() {
        return toDoRepository.deleteAll()
    }

}

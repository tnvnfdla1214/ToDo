package com.example.todo.domain.usecase


import com.example.todo.data.repository.ToDoRepository
import javax.inject.Inject

internal class DeleteAllToDoItemUseCase @Inject constructor(
    private val toDoRepository: ToDoRepository
){

    suspend operator fun invoke() {
        return toDoRepository.deleteAll()
    }

}

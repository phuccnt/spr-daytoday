package phuc.daytoday.todolist.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class TodolistResponseEntityExceptionHandler {

    @ExceptionHandler(TodoListNotFoundException.class)
    public ResponseEntity<TodolistErrorResponse> handleTodoListNotFoundException(TodoListNotFoundException ex) {
        int status = HttpStatus.NOT_FOUND.value();
        String message = ex.getMessage();
        LocalDateTime errorAt = LocalDateTime.now();
        TodolistErrorResponse errorResponse = new TodolistErrorResponse(status, message, errorAt);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }


}

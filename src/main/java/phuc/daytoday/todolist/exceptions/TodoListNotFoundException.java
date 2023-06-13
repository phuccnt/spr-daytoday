package phuc.daytoday.todolist.exceptions;

public class TodoListNotFoundException extends RuntimeException {
    public TodoListNotFoundException(String message) {
        super(message);
    }
}

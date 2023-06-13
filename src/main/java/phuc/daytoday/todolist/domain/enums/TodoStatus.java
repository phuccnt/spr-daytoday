package phuc.daytoday.todolist.domain.enums;

public enum TodoStatus {
    COMPLETED, NOT_COMPLETED, PENDING;

    public static TodoStatus of(String value) {
        for (TodoStatus status : values()) {
            if (status.name().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid TodoStatus: " + value);
    }
}

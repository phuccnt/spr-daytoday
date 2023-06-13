package phuc.daytoday.todolist.domain.enums;

public enum Priority {
    HIGH, MEDIUM, LOW;

    public static Priority of(String value) {
        for (Priority priority : values()) {
            if (priority.name().equalsIgnoreCase(value)) {
                return priority;
            }
        }
        throw new IllegalArgumentException("Invalid Priority: " + value);
    }
}

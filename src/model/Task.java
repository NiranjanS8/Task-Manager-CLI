package model;

public class Task {
    private int id;
    private String title;
    private String description;
    private String dueDate;
    private String priority;
    private boolean isCompleted;

    public Task(int id, String title, String description, String dueDate, String priority, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.isCompleted = isCompleted;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getDueDate() { return dueDate; }
    public String getPriority() { return priority; }
    public boolean isCompleted() { return isCompleted; }

    public void setCompleted(boolean completed) { isCompleted = completed; }

    @Override
    public String toString() {
        return id + " | " + title + " | " + (isCompleted ? "Completed" : "Pending") + " | " + priority + " | " + dueDate;
    }
}

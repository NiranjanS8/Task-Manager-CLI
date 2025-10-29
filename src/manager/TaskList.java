package manager;

import model.Task;
import datastructures.CustomLinkedList;
import java.io.*;

public class TaskList {
    private CustomLinkedList<Task> tasks = new CustomLinkedList<>();
    private int nextId = 1;

    public void addTask(String title, String description, String dueDate, String priority) {
        Task task = new Task(nextId++, title, description, dueDate, priority, false);
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void displayTasks() {
        if (tasks.size() == 0) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("ID | Title | Status | Priority | Due Date");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i));
        }
    }

    public void markComplete(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            if (t.getId() == id) {
                t.setCompleted(true);
                System.out.println("Task marked as completed!");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            if (t.getId() == id) {
                tasks.remove(i);
                System.out.println("Task deleted successfully!");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("tasks.txt"))) {
            for (int i = 0; i < tasks.size(); i++) {
                Task t = tasks.get(i);
                bw.write(t.getId() + "," + t.getTitle() + "," + t.getDescription() + "," + t.getDueDate() + "," + t.getPriority() + "," + t.isCompleted());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        File file = new File("tasks.txt");
        if (!file.exists()) return;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Task t = new Task(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4], Boolean.parseBoolean(data[5]));
                tasks.add(t);
                nextId = Math.max(nextId, t.getId() + 1);
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
}

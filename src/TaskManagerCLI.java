import manager.TaskList;
import java.util.Scanner;

public class TaskManagerCLI {
    private static final Scanner sc = new Scanner(System.in);
    private static final TaskList taskList = new TaskList();

    public static void main(String[] args) {
        taskList.loadFromFile();
        while (true) {
            System.out.println("\n=== Task Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Complete");
            System.out.println("4. Delete Task");
            System.out.println("5. Save & Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addTask();
                case 2 -> taskList.displayTasks();
                case 3 -> markComplete();
                case 4 -> deleteTask();
                case 5 -> { taskList.saveToFile(); System.out.println("Tasks saved. Goodbye!"); return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter description: ");
        String desc = sc.nextLine();
        System.out.print("Enter due date: ");
        String due = sc.nextLine();
        System.out.print("Enter priority (Low/Medium/High): ");
        String prio = sc.nextLine();
        taskList.addTask(title, desc, due, prio);
    }

    private static void markComplete() {
        System.out.print("Enter task ID to mark complete: ");
        int id = Integer.parseInt(sc.nextLine());
        taskList.markComplete(id);
    }

    private static void deleteTask() {
        System.out.print("Enter task ID to delete: ");
        int id = Integer.parseInt(sc.nextLine());
        taskList.deleteTask(id);
    }
}

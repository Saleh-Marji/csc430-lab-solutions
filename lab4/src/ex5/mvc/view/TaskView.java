package ex5.mvc.view;

import ex5.mvc.model.Task;

import java.util.List;
import java.util.Scanner;

public class TaskView {

    private final Scanner scanner = new Scanner(System.in);

    public String listenToUserInput() {
        return scanner.nextLine();
    }

    public void displayTasks(List<Task> tasks) {
        System.out.println("Your tasks are:");
        if(tasks.isEmpty()) System.out.println("Empty!");
        for(Task task : tasks) {
            System.out.println(task.toString());
        }
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to MVC Task Management Application! You have 3 options:");
        System.out.println("add <name: String> <priority: int> ---- to add a task");
        System.out.println("remove <name: String> ---- to remove a task");
        System.out.println("exit; ---- to exit the application");
        System.out.println("have fun!");
    }
}

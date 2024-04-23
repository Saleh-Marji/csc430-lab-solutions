package ex4.mvc.model;

import java.util.*;

public class TaskModel {

    private Set<Task> tasks = new LinkedHashSet<>();
    private static final String INVALID_FORMAT_ERROR = "Your input is invalid! (correct format: %s)";

    public void addTask(String input) {
        String error = INVALID_FORMAT_ERROR.formatted("add <name: String> <priority: int>");
        String[] inputArr = input.split(" ");
        if(inputArr.length != 3 || !Objects.equals(inputArr[0], "add")) {
            System.out.println(error);
            return;
        }
        Task task = new Task();

        task.setName(inputArr[1]);

        try {
            task.setPriority(Integer.parseInt(inputArr[2]));
        } catch (NumberFormatException e) {
            System.out.println(error);
            return;
        }

        tasks.add(task);
    }

    public void removeTask(String input) {
        String error = INVALID_FORMAT_ERROR.formatted("remove <name: String>");
        String[] inputArr = input.split(" ");
        if(inputArr.length != 2 || !Objects.equals(inputArr[0], "remove")) {
            System.out.println(error);
            return;
        }

        Task task = new Task();

        task.setName(inputArr[1]);

        tasks.remove(task);
    }

    public List<Task> getTasks() {
        return tasks.stream().toList();
    }
}

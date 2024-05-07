package ex5.mvc.model;

import ex5.sort.SortStrategy;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class TaskModel {

    private SortStrategy sortStrategy;

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
        List<Task> tasks = this.tasks.stream().toList();
        if(sortStrategy != null) {
            sortStrategy.sort(tasks);
        }
        return tasks;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
}

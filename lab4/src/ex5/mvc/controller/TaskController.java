package ex5.mvc.controller;

import ex5.mvc.model.TaskModel;
import ex5.mvc.view.TaskView;
import ex5.sort.AlphabeticalSortStrategy;

public class TaskController {
    private final TaskView taskView = new TaskView();
    private final TaskModel taskModel = new TaskModel();

    private boolean applicationIsOn = false;

    public void onUserInput(String input) {
        if(input.equals("exit;")) {
            System.out.println("Bye bye...");
            applicationIsOn = false;
            return;
        }
        if(input.startsWith("add ")) {
            taskModel.addTask(input);
        }else if(input.startsWith("remove ")) {
            taskModel.removeTask(input);
        }
        taskModel.setSortStrategy(new AlphabeticalSortStrategy());
        taskView.displayTasks(taskModel.getTasks());
    }

    public void initApplication() {
        taskView.displayWelcomeMessage();
        applicationIsOn = true;
        while(applicationIsOn) {
            onUserInput(taskView.listenToUserInput());
        }
    }
}

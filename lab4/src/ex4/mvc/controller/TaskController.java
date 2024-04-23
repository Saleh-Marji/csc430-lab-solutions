package ex4.mvc.controller;

import ex4.mvc.model.TaskModel;
import ex4.mvc.view.TaskView;

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

package ex4;

import ex4.mvc.controller.TaskController;
import ex4.mvc.model.TaskModel;
import ex4.mvc.view.TaskView;

public class Main {
    public static void main(String[] args) {
        TaskController taskController = new TaskController();
        taskController.initApplication();
    }
}

package ex5.sort;

import ex5.mvc.model.Task;

import java.util.List;

public interface SortStrategy {
    void sort(List<Task> list);
}

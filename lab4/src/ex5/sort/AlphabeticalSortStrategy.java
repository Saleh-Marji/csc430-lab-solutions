package ex5.sort;

import ex5.mvc.model.Task;

import java.util.Comparator;
import java.util.List;

public class AlphabeticalSortStrategy implements SortStrategy {
    @Override
    public void sort(List<Task> list) {
        list.sort(Comparator.comparing(Task::getName));
    }
}

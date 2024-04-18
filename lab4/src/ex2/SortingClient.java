package ex2;

import ex2.sort.BubbleSort;
import ex2.sort.QuickSort;
import ex2.sort.SortContext;

import java.util.ArrayList;
import java.util.List;

public class SortingClient {
    public static void main(String[] args) {
        SortContext sortContext = new SortContext();

        sortContext.setSortStrategy(new BubbleSort());
        ArrayList<Integer> list = new ArrayList<>(List.of(5, 8, 7, 3));
        sortContext.performSort(list);

        sortContext.setSortStrategy(new QuickSort());
        ArrayList<Integer> list2 = new ArrayList<>(List.of(5, 8, 7, 3));
        sortContext.performSort(list2);
    }
}

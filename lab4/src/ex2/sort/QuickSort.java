package ex2.sort;

import java.util.ArrayList;
import java.util.Comparator;

public class QuickSort implements SortStrategy {
    @Override
    public void sort(ArrayList<Integer> list) {
        System.out.println("Sorting using quick sort ...");
        list.sort(Comparator.comparing(Integer::intValue));
        System.out.println("Sorted list: " + list);
    }
}

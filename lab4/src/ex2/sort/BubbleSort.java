package ex2.sort;

import java.util.ArrayList;
import java.util.Comparator;

public class BubbleSort implements SortStrategy {
    @Override
    public void sort(ArrayList<Integer> list) {
        System.out.println("Sorting using Bubble Sort ... ");
        list.sort(Comparator.comparing(Integer::intValue));
        System.out.println("Sorted list: "+list);
    }
}

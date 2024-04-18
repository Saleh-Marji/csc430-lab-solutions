package ex2.sort;

import java.util.ArrayList;
import java.util.List;

public class SortContext {
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void performSort(ArrayList<Integer> list) {
        if(sortStrategy == null){
            System.out.println("Sort strategy is null! Kindly set it and try again.");
            return;
        }
        sortStrategy.sort(list);
    }
}

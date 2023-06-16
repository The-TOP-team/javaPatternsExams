package org.example;

public class ArraySorter {
    private SortStrategy strategy;

    public ArraySorter(SortStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array){
        strategy.sort(array);
    }
}

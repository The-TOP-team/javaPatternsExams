package org.example;

public class Main {
    /*Паттерн Стратегия определяет семейство алгоритмов, инкапсулирует каждый из них и делает их взаимозаменяемыми.
     Позволяет изменять алгоритмы независимо от клиентов, которые их используют.*/
    public static void main(String[] args) {
        ArraySorter sorter = new ArraySorter(new BubbleSortStrategy());
        int[] a = {1,2,3};
        sorter.sortArray(a);
        sorter.setStrategy(new QuickSortStrategy());
        sorter.sortArray(a);
    }
}
package com.company;

public class SortingManager {
    private Algorithm bubbleSort;
    private Algorithm quickSort;
    private Algorithm mergeSort;

    public SortingManager() {
        bubbleSort = new BubbleSort();
        quickSort = new QuickSort();
        mergeSort = new MergeSort();
    }

    public void duBubbleSort() {
        this.bubbleSort.sort();
    }

    public void doMergeSort() {
        this.mergeSort.sort();
    }

    public void doQuickSort() {
        this.quickSort.sort();
    }
}

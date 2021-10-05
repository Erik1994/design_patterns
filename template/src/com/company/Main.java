package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,9,0,6,3,1,8,6,4,5};
        Algorithm bubbleSort = new BubbleSort(nums);
        Algorithm selectionSort = new SelectionSort(nums);
        bubbleSort.sort();
        selectionSort.sort();
    }
}

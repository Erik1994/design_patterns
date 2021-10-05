package com.company;

public class BubbleSort extends Algorithm {

    public BubbleSort(int[] nums) {
        super(nums);
    }

    @Override
    protected void initialize() {
        System.out.println("Bubble the selection sort algorithm...");
    }

    @Override
    protected void sorting() {
        for(int i = 0; i < nums.length - 1; ++i) {
            for (int j = 0; j < nums.length - 1; ++j) {
                if(nums[j] > nums[j + 1]) {
                    swap(j, j+1);
                }
            }
        }
    }

    @Override
    protected void showResult() {
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}

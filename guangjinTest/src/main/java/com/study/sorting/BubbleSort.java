package com.study.sorting;

import java.util.Arrays;


public class BubbleSort {
	public static void main(String[] args) {
		int[] arr ={3,6,5,2,1,4};
		bubbleSort2(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void bubbleSort(int[] arr) {
	    if(arr == null || arr.length == 0)
	        return ;
	    for(int i=0; i<arr.length-1; i++) {
	        for(int j=0; j<arr.length-i-1; j++) {
	            if(arr[j] > arr[j+1]) {
	                swap(arr, j+1, j);
	            }
	        }
	    }
	}
	//选择
	public static void bubbleSort2(int[] arr) {
	    if(arr == null || arr.length == 0)
	        return ;
	    for(int i=0; i<arr.length-1; i++) {
	        for(int j=i+1; j<arr.length; j++) {
	            if(arr[i] > arr[j]) {
	                swap(arr, i, j);
	            }
	        }
	    }
	}
	
	
	public static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
}

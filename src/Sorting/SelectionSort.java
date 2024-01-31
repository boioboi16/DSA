package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,9,8,2,1};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			int minimumIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[minimumIndex] > arr[j]) {
					minimumIndex = j;
				}
			}
			swap(minimumIndex,i,arr);
		}
		
	}

	private static void swap(int minimumIndex, int smaller, int[] arr) {
		int swap = arr[minimumIndex];
		arr[minimumIndex] = arr[smaller];
		arr[smaller] = swap;
	}

}

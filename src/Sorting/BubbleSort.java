package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,9,8,2,1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		
		for(int iter = 0 ; iter < arr.length - 1;iter++) {// N-1 Iterations
			for(int j = 0; j < arr.length - iter - 1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(j,j+1,arr);
				}
			}
		}
//		System.out.println(arr);
		
	}

	private static void swap(int bigger, int smaller, int[] arr) {
		int swap = arr[bigger];
		arr[bigger] = arr[smaller];
		arr[smaller] = swap;
		
	}

}
// Total number of comparisons=(n−1)+(n−2)+(n−3)+…+2+1
// which is equal to n(n+1)/2 therefore the time complexity is O(N^2)

//Auxiliary Space: O(1)


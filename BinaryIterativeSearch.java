//package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	/*
	Remove all TODO's from code before final submission
	*/
	public String searchName() {
		// TODO Auto-generated method stub
		return "binary-iterative";
	}

	public int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = arr.length - 1;
		int mid;
		
		while(min <= max){
			mid = (min + max) / 2;
			if(arr[mid] == target)
				return mid;
			if(arr[mid] > target)
				max = mid - 1;
			else
				min = mid + 1;
		}
		return -1;
	}

}

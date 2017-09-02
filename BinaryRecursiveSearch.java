package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	public String searchName() {
		// TODO Auto-generated method stub
		return "binary-recursive";
	}

	public int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = arr.length - 1;
		return search(arr, target, min, max);
	}

	private int search(int[] arr, int target, int min, int max) {
		// TODO Auto-generated method stub
		if(min >= max)
			return -1;
		
		int mid = (min + max) / 2;
		
		if(arr[mid] == target)
			return mid;
		if(arr[mid] > target)
			return search(arr, target, min, mid - 1);
		else
			return search(arr, target, mid + 1, max);
		
	}

}

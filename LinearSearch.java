//package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {

	public String searchName() {
		// TODO Auto-generated method stub
		return "linear";
	}

	public int search(int[] arr, int target) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target)
				return i;
		}
		return -1;
	}

}

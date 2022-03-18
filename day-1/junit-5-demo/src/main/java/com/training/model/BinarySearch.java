package com.training.model;

public class BinarySearch {
	
	public boolean find(int[] sortedkey, int key) {
		return search(sortedkey, key, 0, sortedkey.length - 1);
		}

		 private boolean search(int[] sortedkey, int key, int startIndex, int endIndex) {
         
			 
			 // to find index
		 if (startIndex > endIndex) {
		return false;
		}
		 
		 //to find middel index
         int middle = (endIndex + startIndex) / 2;
         
         
         //recursive binary search
		 if (sortedkey[middle] > key) {
		return search(sortedkey, key, startIndex, middle - 1);
		} else if (sortedkey[middle] < key) {
		return search(sortedkey, key, middle + 1, endIndex);
		} else {
		return true;
		}
		}

}

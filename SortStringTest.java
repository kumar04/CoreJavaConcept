package com.ds.sort;

public class SortStringTest {

	public void sortArray(String[] arr) {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public void printSortArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortStringTest obj = new SortStringTest();
		String array[] = { "AB", "ZY", "TU", "AB", "SR", "GH" };
		obj.sortArray(array);
		System.out.println("Sort Array");
		obj.printSortArray(array);
	}

}

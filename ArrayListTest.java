package com.core.LT;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public double averageFourNumber(ArrayList<Integer> number) {
		int count = 0;
		int sum = 0;
		float average = 0.0F;
		for (int i = 0; i < number.size(); i++) {
			count++;
			sum = sum + number.get(i);

			if (count == 4) {
				average = (float) sum / 4;
				System.err.println("Average of every four digit:" + average);
				count = 0;
				sum = 0;
			}
		}
		return average;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListTest obj = new ArrayListTest();
		ArrayList<Integer> arList = new ArrayList<Integer>();
		arList.add(1);
		arList.add(5);
		arList.add(12);
		arList.add(8);
		arList.add(10);
		arList.add(6);
		arList.add(10);
		arList.add(9);
		arList.add(19);
		arList.add(6);
		double averageCount = obj.averageFourNumber(arList);
		// System.out.println("The average count of array list:" +
		// averageCount);
		m1();
	}

	public static void m1() {

		List<Character> list = new ArrayList<>();
		for (int i = 65; i <= 90; i++) {
			list.add((char) i);
		}

		list.forEach(e -> System.out.println(e));
		
		for(int i=0;i<list.size()/2;i++)
		{
			int temp=list.size()-1-i;
			
			char c1=list.get(i);
			char c2=list.get(temp);
			
			System.out.println(c1+"--"+c2);
		}
	}

}

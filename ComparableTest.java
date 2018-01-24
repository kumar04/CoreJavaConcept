package com.core.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Moive> list = new ArrayList<Moive>();
		list.add(new Moive("BHJ", 2015, 8.7));
		list.add(new Moive("Dangal", 2016, 8.9));
		list.add(new Moive("FAN", 2014, 5.8));
		Collections.sort(list);
		System.out.println("After Sorting:");
		for (Moive moive : list) {
			System.out.println(moive.getName() + " " + moive.getRating() + " " + moive.getYear());
		}

	}

}

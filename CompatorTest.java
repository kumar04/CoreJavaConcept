package com.core.compator;

import java.util.ArrayList;
import java.util.Collections;

public class CompatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Moive> list = new ArrayList<Moive>();
		list.add(new Moive("DDLJ", 1980, 9.0));
		list.add(new Moive("GRAV", 1990, 8.7));
		list.add(new Moive("SOS", 2016, 8.6));
		System.out.println("Sorting By rating");
		RatingMoiveComparatot rating = new RatingMoiveComparatot();
		Collections.sort(list, rating);
		for (Moive moive : list) {
			System.out.println(moive.getRating() + " " + moive.getName() + " " + moive.getYear());
		}
		System.out.println("Sorting By Name");
		NameMoiveComparator nameSort = new NameMoiveComparator();
		Collections.sort(list, nameSort);
		for (Moive moive : list) {
			System.out.println(moive.getName() + " " + moive.getRating() + " " + moive.getYear());
		}
		System.out.println("Sorting By Year");
		Collections.sort(list);
		for (Moive moive : list) {
			System.out.println(moive.getYear() + " " + moive.getName() + " " + moive.getRating());
		}
	}

}

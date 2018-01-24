package com.core.compator;

import java.util.Comparator;

public class NameMoiveComparator implements Comparator<Moive> {

	@Override
	public int compare(Moive m1, Moive m2) {
		// TODO Auto-generated method stub
		return m1.getName().compareTo(m2.getName());
	}

}

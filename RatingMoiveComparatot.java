package com.core.compator;

import java.util.Comparator;

public class RatingMoiveComparatot implements Comparator<Moive> {

	@Override
	public int compare(Moive m1, Moive m2) {
		// TODO Auto-generated method stub
		if (m1.getRating() < m2.getRating())
			return -1;
		if (m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;
	}

}

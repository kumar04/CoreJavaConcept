package com.core.compator;

public class Moive implements Comparable<Moive> {

	private String name;
	private int year;
	private double rating;

	/**
	 * @param name
	 * @param year
	 * @param rating
	 */
	public Moive(String name, int year, double rating) {
		this.name = name;
		this.year = year;
		this.rating = rating;
	}

	@Override
	public int compareTo(Moive m) {
		// TODO Auto-generated method stub
		return this.year - m.year;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}

}

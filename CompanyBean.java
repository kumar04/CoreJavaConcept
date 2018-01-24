package com.core.serialization;

import java.io.Serializable;

public class CompanyBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private int establishYear;
	private EmployeeModel model;

	public void display() {
		System.out.println("Display the information................");
	}

	public static void main(String args[]) {
		CompanyBean test = new CompanyBean();
		test.display();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the establishYear
	 */
	public int getEstablishYear() {
		return establishYear;
	}

	/**
	 * @param establishYear
	 *            the establishYear to set
	 */
	public void setEstablishYear(int establishYear) {
		this.establishYear = establishYear;
	}

	/**
	 * @return the model
	 */
	public EmployeeModel getModel() {
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(EmployeeModel model) {
		this.model = model;
	}

}

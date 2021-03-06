package siit.java.homeworks.parkingspace;

import java.util.Comparator;

/**
 * This class is the creation of the employee, with name, position, seniority and if they have or not parking places.
 * 
 * @author Rares Neamtu
 */

public class Employee implements Comparable<Employee> {
	private String name;
	private String position;
	private int seniority;
	private boolean parking;

	/*
	 * The constructor
	 */

	public Employee(String name, String position, int seniority, boolean parking) {
		this.name = name;
		this.position = position;
		this.seniority = seniority;
		this.parking = parking;
	}

	/*
	 * Getters
	 */
	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public int getSeniority() {
		return seniority;
	}

	public boolean isParking() {
		return parking;
	}

	/*
	 * Seniority comparator is to see how many years they have been working with
	 * this company
	 */
	public static Comparator<Employee> Seniority = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o2.seniority - o2.seniority;
		}

	};

	@Override
	public int compareTo(Employee o) {
		return (this.name).compareTo(o.name);
	}
}

package siit.java.homeworks.homework7;

import java.util.Collection;
import java.util.TreeSet;

public class Employee {

public static void main(String[] args) {

	
	Collection<Employee> treeSetEmployee = new TreeSet<>();
	
	treeSetEmployee.add(new Employee());

	
		for (Employee employee : treeSetEmployee) {
		System.out.println(employee);
		}

	}
}
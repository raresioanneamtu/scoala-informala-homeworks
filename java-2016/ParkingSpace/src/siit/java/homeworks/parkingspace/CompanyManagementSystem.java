package siit.java.homeworks.parkingspace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class is where we have the methods that we use.
 * 
 * @author Rares Neamtu
 */
public class CompanyManagementSystem {

	/*
	 * Add method is used to add employees in the list. We have a list with all
	 * the employee , with all the managers, with all the juniors and with the
	 * testers. Also we have the lists with the employee with parking places and
	 * without parking places.
	 * 
	 * And a WrongSeniorityException.
	 * 
	 */
	private List<Employee> employeeList = new ArrayList<Employee>();
	private List<Employee> juniorList = new ArrayList<Employee>();
	private List<Employee> testerList = new ArrayList<Employee>();
	private List<Employee> managerList = new ArrayList<Employee>();
	private List<Employee> employeeListWithParking = new ArrayList<Employee>();
	private List<Employee> employeeListWithoutParking = new ArrayList<Employee>();

	public void add(Employee employee) throws WrongSeniorityException {
		if (employee.getPosition() != "manager" && employee.getPosition() != "junior"
				&& employee.getPosition() != "tester") {
			throw new WrongSeniorityException("Seniority is not: " + employee.getName());
		}

		else
			employeeList.add(employee);

		if (employee.getPosition() == "junior")
			juniorList.add(employee);

		if (employee.getPosition() == "tester")
			testerList.add(employee);

		if (employee.getPosition() == "manager")
			managerList.add(employee);

		if (employee.isParking() == false)
			employeeListWithoutParking.add(employee);

		else if (employee.isParking() == true)
			employeeListWithParking.add(employee);

	}

	public void printAllEmployees() {
		System.out.print("Employee's list: \n");
		for (Employee employee : employeeList)
			System.out.print(employee.getName() + ",");
	}

	public void printJuniors() {
		System.out.print("\nJunior list: \n");
		for (Employee employee : juniorList) {
			System.out.print("Junior" + employee.getName() + ",");
		}
	}

	public void printTester() {
		System.out.print("\nTester list: \n");
		for (Employee employee : testerList) {
			System.out.print("Tester" + employee.getName() + ",");
		}
	}

	public void printManager() {
		System.out.print("\nManager list: \n");
		for (Employee employee : managerList) {
			System.out.print("Manager" + employee.getName() + ",");
		}
	}

	public void printEmployeesWithParking() {
		System.out.print("\nEmployee's with parking: \n");
		for (Employee employee : employeeListWithParking)
			System.out.print(employee.getName() + ",");
	}

	public void printEmployeesWithNoParking() {
		System.out.println("\nEmployee's without parking: \n");
		Collections.sort(employeeListWithoutParking, Employee.Seniority);
		for (Employee employee : employeeListWithoutParking)
			System.out.println(employee.getName() + ", seniority: " + employee.getSeniority());

	}
}

package siit.java.homeworks.parkingspace;

import org.junit.Test;
/**
 * This test the management system of the company
 * 
 * @author Rares Neamtu
 *
 */

public class CompanyManagementSystemTest {

	@Test
	public void companyManagementSystemTest() throws WrongSeniorityException {
		CompanyManagementSystem employeeList = new CompanyManagementSystem();
		try {
			employeeList.add(new Employee("Simina", "manager", 13, true));
			employeeList.add(new Employee("Ionut", "junior", 2, false));
			employeeList.add(new Employee("Rares", "tester", 1, false));
		} catch (WrongSeniorityException w) {
			w.printStackTrace();
		} finally {
			System.out.println("Manager is: Simina ");
			employeeList.printManager();
			System.out.println("\n\n");
			System.out.println("Juniors is: Ionut ");
			employeeList.printJuniors();
			System.out.println("\n\n");
			System.out.println("Tester is: Rares ");
			employeeList.printTester();
			System.out.println("\n\n");
			System.out.println("Employee with parking: Simina ");
			employeeList.printEmployeesWithParking();
			System.out.println("\n\n");
			System.out.println("Employee without parking: Ionut & Rares");
			employeeList.printEmployeesWithNoParking();

		}

	}
}

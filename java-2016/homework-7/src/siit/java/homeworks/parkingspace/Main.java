package siit.java.homeworks.parkingspace;
/**
 * This class is the main class
 * 
 * @author Rares Neamtu
 *
 */
public class Main {

	public static void main(String[] args) throws WrongSeniorityException {
		
		CompanyManagementSystem employeeList = new CompanyManagementSystem();
		
		employeeList.add(new Employee("Fabio", "manager", 11, true));
		employeeList.add(new Employee("Edgardo", "manager", 15, true));
		employeeList.add(new Employee("Simina", "manager", 13, true));
		employeeList.add(new Employee("Ionut", "junior", 2, false));
		employeeList.add(new Employee("Rares", "tester", 1, false));
		employeeList.add(new Employee("Andreea", "junior", 3, true));
		employeeList.add(new Employee("Bogdan", "manager", 9, true));
		employeeList.add(new Employee("Madalina", "tester", 2, false));
		employeeList.add(new Employee("Andrei", "manager", 10, true));
		employeeList.add(new Employee("Catalina", "junior", 2, false));
		
		employeeList.printAllEmployees();
		employeeList.printJuniors();
		employeeList.printTester();
		employeeList.printManager();
		employeeList.printEmployeesWithParking();
		employeeList.printEmployeesWithNoParking();
		
	}

}

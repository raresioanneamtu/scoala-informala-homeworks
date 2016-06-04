package siit.java.homeworks.parkingspace;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This tests the employee
 * 
 * @author Rares Neamtu
 *
 */

public class EmployeeTest {

	@Test
	public void employeeTest() {
		Employee employee = new Employee("Radu", "tester", 1, false);

		if (employee instanceof Employee) {

			assertEquals("Radu", employee.getName());
			assertEquals("tester", employee.getPosition());
			assertEquals(1, employee.getSeniority());
			assertEquals(false, employee.isParking());
		}
	}

}

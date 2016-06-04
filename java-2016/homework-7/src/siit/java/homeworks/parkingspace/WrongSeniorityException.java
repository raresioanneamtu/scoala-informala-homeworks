package siit.java.homeworks.parkingspace;
/**
 * This class throws an exception. If the seniority is other than manager, junior or tester is given to another employee
 * will tell us 
 */

public class WrongSeniorityException extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongSeniorityException(String s) {
		super(s);
	}

}

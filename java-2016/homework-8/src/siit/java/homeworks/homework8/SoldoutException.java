package siit.java.homeworks.homework8;

/**
 * Once all the tickets are sold we have an exception that says "Toate biletele au fost vandute"
 * 
 * @author Rares
 *
 */

public class SoldoutException extends Exception {

	private static final long serialVersionUID = 1L;

	public SoldoutException(String string) {
		super(string);
	}

}
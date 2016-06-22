package siit.java.homeworks.homework8;

/**
 * Once the tickets from a category are soldout, we have an exception that says "Nu mai sunt bilete la categoria 1,2,3"
 * 
 * @author Rares
 *
 */

public class CategoryTicketsSoldoutException extends Exception {

	private static final long serialVersionUID = 1L;

	public CategoryTicketsSoldoutException(String string) {
		super(string);
	}

}
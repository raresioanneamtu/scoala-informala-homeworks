package siit.java.homeworks.homework8;

/**
 * This class is a child class of Ticket and it models a category one ticket.
 * 
 * @Rares
 */

public class TicketCategory1 extends Ticket {
	/**
	 * This method returns the price for a ticket
	 */

	public double ticketPrice() {
		return 120;
	}

	/**
	 * This method returns the category of the ticket "one".
	 */

	public String getCategory() {
		return "One";
	}
}
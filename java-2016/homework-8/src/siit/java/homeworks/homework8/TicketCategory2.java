package siit.java.homeworks.homework8;

/**
 * This class is a child class of Ticket and it models a category two ticket.
 * 
 * @Rares
 */

public class TicketCategory2 extends Ticket {
	/**
	 * This method returns the price for a ticket
	 */

	public double ticketPrice() {
		return 80;

	}

	/**
	 * This method returns the category of the ticket "two".
	 */

	public String getCategory() {
		return "Two";
	}
}
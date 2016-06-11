package siit.java.homeworks.homework8;

public class TicketCategory1 extends Ticket {

	public TicketCategory1(int price, int category, int ticketsSold, int ticketsToSold) {
		super(ticketsToSold);
		price = 120;
		category = 1;

	}

	public int getcategory() {
		return getcategory();
	}

	public int getTicketPrice() {
		return getPrice();
	}

	public int getSoldTickets() {
		return getSoldTickets();
	}

	public void setticketsToSold(int ticketsToSold) {
		this.ticketsToSold = ticketsToSold;
	}

}

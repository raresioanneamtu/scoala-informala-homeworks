package siit.java.homeworks.homework8;

public class TicketCategory2 extends Ticket {

	public TicketCategory2(int price, int category, int ticketsSold, int ticketsToSold) {
		super(ticketsToSold);
		price = 80;
		category = 2;

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

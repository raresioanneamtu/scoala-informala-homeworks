package siit.java.homeworks.homework8;

public class TicketCategory3 extends Ticket {

	public TicketCategory3(int price, int category, int ticketsSold, int ticketsToSold) {
		super(ticketsToSold);
		price = 50;
		category = 3;

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
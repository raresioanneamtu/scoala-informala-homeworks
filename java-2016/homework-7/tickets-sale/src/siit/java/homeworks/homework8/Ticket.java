package siit.java.homeworks.homework8;

public class Ticket {

	private int price;
	private int category;
	private int ticketsSold;
	protected int ticketsToSold;

	public Ticket(int price, int category, int ticketsSold, int ticketsToSold) {
		super();
		this.price = price;
		this.category = category;
		this.ticketsSold = ticketsSold;
		this.ticketsToSold = ticketsToSold;
	}

	public Ticket(int ticketsToSold) {
		super();
		this.ticketsToSold = ticketsToSold;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketsSold(int ticketsSold) {
		this.ticketsSold = ticketsSold;
	}

	public int getTicketsToSold() {
		return ticketsToSold;
	}

	public void setTicketsToSold(int ticketsToSold) {
		this.ticketsToSold = ticketsToSold;
	}

}

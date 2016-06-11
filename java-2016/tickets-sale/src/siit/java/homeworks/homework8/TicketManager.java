package siit.java.homeworks.homework8;

import java.util.HashMap;
import java.util.Map;

public class TicketManager {
	private Map<Ticket, Double> tickets = new HashMap<>();
	private Map<Ticket, Double> price = new HashMap<>();

	public Map<Ticket, Double> getTickets() {
		return tickets;
	}

	public void setTickets(Map<Ticket, Double> tickets) {
		this.tickets = tickets;
	}

	public Map<Ticket, Double> getPrice() {
		return price;
	}

	public void setPrice(Map<Ticket, Double> price) {
		this.price = price;
	}

}

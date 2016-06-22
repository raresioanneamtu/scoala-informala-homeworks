package siit.java.homeworks.homework8;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a TicketManager and takes a number of tickets and
 * splits it in to three category's (0ne- 15%, two-35%, three-50%). Simulates
 * the selling of the tickets, by selling from category three to category one
 * and every 17th buyer it sells 3 tickets.
 * 
 * @Rares
 */

public class TicketManager {
	private Map<Ticket, Double> tickets = new HashMap<>();
	private Map<Ticket, Double> price = new HashMap<>();
	public Ticket three = new TicketCategory3();
	public Ticket two = new TicketCategory2();
	public Ticket one = new TicketCategory1();

	/**
	 * The constructor splits it in to three category's (0ne- 15%, two-35%,
	 * three-50%).
	 * 
	 */

	public TicketManager(double numberOftickets) {

		tickets.put(three, (numberOftickets * 0.5));
		tickets.put(two, (numberOftickets * 0.35));
		tickets.put(one, (numberOftickets * 0.15));

		try {
			ticketHandlerCategory(numberOftickets + 13, three);

		} catch (CategoryTicketsSoldoutException e) {

			e.printStackTrace();
		}
		try {
			ticketHandlerCategory(numberOftickets + 13, two);
		} catch (CategoryTicketsSoldoutException e) {

			e.printStackTrace();

		}
		try {
			ticketHandlerCategory(numberOftickets + 13, one);
		} catch (CategoryTicketsSoldoutException e) {

			e.printStackTrace();

		}
		try {
			soldOut();
		} catch (SoldoutException e) {
			e.printStackTrace();
		}
		print();

	}

	private void soldOut() throws SoldoutException {
		if (tickets.get(three) == 0 && tickets.get(two) == 0 && tickets.get(one) == 0) {
			throw new SoldoutException("Toate bilete au fost vandude.");

		}

	}

	private void print() {
		printFinal(three);
		printFinal(two);
		printFinal(one);
		double total = price.get(three) + price.get(two) + price.get(one);
		System.out.println("Total: " + total);
	}

	private void printFinal(Ticket o) {

		System.out.println("Ticket category: " + o.getCategory() + ", Money made:  " + price.get(o));

	}

	/**
	 * This method sells thickets from category three and it calculates the
	 * price per ticket category.
	 */

	public void ticketHandlerCategory(double d, Ticket o) throws CategoryTicketsSoldoutException {

		int ticketSold = 0;
		int counter = 0;

		for (int i = 0; i < d; i++) {
			int thicketNumbers = tickets.get(o).intValue();

			counter++;

			if (counter != 17) {
				ticketSold++;
				tickets.put(o, (double) (thicketNumbers - 1));

			} else if (counter == 17 && thicketNumbers == 0) {

				tickets.put(o, (double) (thicketNumbers - 0));

				counter = 0;
			} else if (counter == 17 && thicketNumbers == 1) {

				tickets.put(o, (double) (thicketNumbers - 1));
				ticketSold++;
				counter = 0;
			} else if (counter == 17 && thicketNumbers == 2) {
				tickets.put(o, (double) (thicketNumbers - 2));
				ticketSold = ticketSold + 2;
				counter = 0;
			} else if (counter == 17) {
				tickets.put(o, (double) (thicketNumbers - 3));
				ticketSold = ticketSold + 3;
				counter = 0;
			}

			System.out.println("Thicket Category" + o.getCategory() + " price:" + o.ticketPrice() + " lei"
					+ ", available :" + thicketNumbers);

			if (thicketNumbers == 0) {
				tickets.put(o, (double) 0);

				throw new CategoryTicketsSoldoutException("Nu mai sunt bilete la categoria " + o.getCategory());

			}

			money(o, ticketSold);

		}
	}

	private void money(Ticket o, int ticketSold) {
		price.put(o, ticketSold * o.ticketPrice());

	}

	/**
	 * This method returns the number of tickets per category.
	 * 
	 */

	public double getTicket(Ticket tic) {
		return tickets.get(tic);

	}
}
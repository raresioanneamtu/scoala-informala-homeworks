package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import siit.java.homeworks.homework8.CategoryTicketsSoldoutException;
import siit.java.homeworks.homework8.SoldoutException;
import siit.java.homeworks.homework8.TicketManagerTenis;

public class TicketManagerTenisTest {

	// (expected = CategoryTicketsSoldoutException.class)

	@Test
	public void AllTicketsOfCategoryThHreeSoledTest() {

		TicketManagerTenis tic = new TicketManagerTenis(100);
		assertEquals(0, tic.getTicket("three"), 1);

	}

	@Test
	public void TicketsSoledCategoryThree() {
		TicketManagerTenis tenis = new TicketManagerTenis(100);
		try {
			tenis.ticketHandlerCategoryThree(113, "three");
		} catch (CategoryTicketsSoldoutException e) {
			e.printStackTrace();
		}

		assertEquals(2800, tenis.moneyPerCategory("three"), 1);

	}

	@Test
	public void TicketsSoledCategoryTwo() {
		TicketManagerTenis tenis = new TicketManagerTenis(100);
		try {
			tenis.ticketHandlerCategoryThree(113, "two");
		} catch (CategoryTicketsSoldoutException e) {
			e.printStackTrace();
		}

		assertEquals(2500, tenis.moneyPerCategory("two"), 1);

	}

	@Test
	public void TicketsSoledCategory0ne() {
		TicketManagerTenis tenis = new TicketManagerTenis(100);
		try {
			tenis.ticketHandlerCategoryThree(113, "one");
		} catch (CategoryTicketsSoldoutException e) {
			e.printStackTrace();
		}

		assertEquals(1800, tenis.moneyPerCategory("one"), 1);

	}

	@Test(expected = CategoryTicketsSoldoutException.class)
	public void TicketsSoledOutCategoryThree() throws CategoryTicketsSoldoutException {
		TicketManagerTenis tenis = new TicketManagerTenis(100);

		tenis.ticketHandlerCategoryThree(113, "three");

	}

	@Test(expected = CategoryTicketsSoldoutException.class)
	public void TicketsSoledOutCategoryTwo() throws CategoryTicketsSoldoutException {
		TicketManagerTenis tenis = new TicketManagerTenis(100);

		tenis.ticketHandlerCategoryThree(113, "two");

	}

	@Test(expected = SoldoutException.class)
	public void TicketsSoledOutCategoryOne() throws SoldoutException {
		TicketManagerTenis tenis = new TicketManagerTenis(100);

		tenis.ticketHandlerCategoryOne(113, "one");

	}

}
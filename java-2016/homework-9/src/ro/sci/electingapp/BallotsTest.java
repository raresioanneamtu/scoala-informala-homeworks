package ro.sci.electingapp;
/**
 * JunitTest for adding and removing a citizen
 * 
 * @author Rares
 */

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;

public class BallotsTest {

	@Test
	public void test() {
		Collection<CitizenVote> votes = new ArrayList<>();
		votes.add(new CitizenVote(new Date(), "2909763891982", "Burt Reynolds", Candidate.MR_BEAN));
		votes.add(new CitizenVote(new Date(), "0977187368992", "Ronaldo", Candidate.SPIRT_MONA));
		votes.remove(new CitizenVote(new Date(), "1982037357397", "Dick Dastardly", Candidate.MUTTLEY));
		
		assertEquals(2, votes.size(), 0);
		 	
		
	}

}

package ro.sci.electingapp;
/**
 * This class shows us the formate of the "TXT" file.
 * 
 * @author Rares
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TXTVoteFormater {

	// TODO CODE REVIEW: This formatter is not configured!
	private static final SimpleDateFormat DATE_FORMATER = new SimpleDateFormat();

	public String toTXT(CitizenVote citizenVote) {

		
		return DATE_FORMATER.format(citizenVote.getDate()) + "," + citizenVote.getCnp() + ","
				+ citizenVote.getCitizenName() + "," + citizenVote.getCandidate();
	}

	public CitizenVote fromTXT(String line) throws ParseException {
		String[] tokens = line.split(",");
		Date d = DATE_FORMATER.parse(tokens[0]);
		Candidate c = Candidate.valueOf(tokens[3]);
		return new CitizenVote(d, tokens[1], tokens[2], c);
	}

}

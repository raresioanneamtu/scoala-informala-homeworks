package ro.sci.electingapp;
/**
 * This class saves and synchronize the "votes.txt" file
 * 
 * @author Rares
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class VoteRecords implements VotingSystem {

	protected static final String CITIZEN_VOTES = "votes.txt";
	protected TXTVoteFormater txtformater = new TXTVoteFormater();

	@Override
	public void save(List<CitizenVote> citizenVote) throws IOException {
		File file = new File(CITIZEN_VOTES);
		try (FileWriter writer = new FileWriter(file, true)) {
			for (CitizenVote vote : citizenVote) {
				writer.append(txtformater.toTXT(vote) + "\n");
			}
		}
	}

	@Override
	public synchronized List<CitizenVote> loadAll() throws FileNotFoundException, IOException, ParseException {
		File file = new File(CITIZEN_VOTES);
		ArrayList<CitizenVote> citizenVote = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = reader.readLine();
			while (line != null) {
				CitizenVote e = txtformater.fromTXT(line);
				citizenVote.add(e);
				line = reader.readLine();
			}
		}
		return citizenVote;
	}

}

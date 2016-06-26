package ro.sci.electingapp;
/**
 * This class we handle the "TXT" file that we created. We open, close and save the changes that were made.
 * 
 * @author Rares
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OptimizedVoteRecords extends VoteRecords implements AutoCloseable {

	private FileWriter writer;

	public void openTXT() throws IOException {
		File file = new File(CITIZEN_VOTES);
		writer = new FileWriter(file, true);
	}

	public void closeTXT() throws IOException {
		if (writer != null) {
			writer.close();
		}
	}

	public void save(CitizenVote citizenVote) throws IOException {
		writer.append(txtformater.toTXT(citizenVote) + "\n");
	}

	@Override
	public void close() throws Exception {
		closeTXT();

	}

}

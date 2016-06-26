package ro.sci.electingapp;
/**
 * 
 * @author Rares
 */

import java.util.List;

public class Ballots {

	private VotingSystem repo;

	public Ballots(VotingSystem repo) {

		this.repo = repo;
	}

	public void save(List<CitizenVote> citizenVote) throws Exception {

		repo.save(citizenVote);
	}

}

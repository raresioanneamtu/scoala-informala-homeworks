package ro.sci.electingapp;

import java.util.List;

// TODO CODE REVIEW: If this is a voting system, maybe the methods should be called saveVotes, loadVotes. Otherwise this is a very generic interface with a very specific name.
public interface VotingSystem {

	void save(List<CitizenVote> citizenVote) throws Exception;

	List<CitizenVote> loadAll() throws Exception;

}

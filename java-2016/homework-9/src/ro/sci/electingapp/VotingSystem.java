package ro.sci.electingapp;

import java.util.List;

public interface VotingSystem {

	void save(List<CitizenVote> citizenVote) throws Exception;

	List<CitizenVote> loadAll() throws Exception;

}

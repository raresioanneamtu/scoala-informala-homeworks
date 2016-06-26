package ro.sci.electingapp;

/**
 * In the main class we have the citizen that can vote, where we consider some things:
 * like when o citizen votes 2 times and when a citizen doesn`t put a candidate on his ballot.
 * For the first case we don`t let the citizen to vote twice, and for the second case we annul the vote.
 * We calculate the elected mayor.
 * 
 * @author Rares
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws Exception {

		try (OptimizedVoteRecords repo = new OptimizedVoteRecords()) {

			repo.openTXT();

			Ballots records = new Ballots(repo);
			List<CitizenVote> citizenVotes = new ArrayList<CitizenVote>();

			citizenVotes.add(new CitizenVote(new Date(), "1982037357397", "Dick Dastardly", Candidate.MUTTLEY));
			citizenVotes.add(new CitizenVote(new Date(), "2909763891982", "Burt Reynolds", Candidate.MR_BEAN));
			citizenVotes.add(new CitizenVote(new Date(), "0977187368992", "Ronaldo", Candidate.SPIRT_MONA));
			citizenVotes.add(new CitizenVote(new Date(), "8889097263791", "Britney Spears", Candidate.A_Tree));
			citizenVotes.add(new CitizenVote(new Date(), "9555682954009", "Stevie Wonder", null));
			citizenVotes.add(new CitizenVote(new Date(), "1982037357397", "Dick Dastardly", Candidate.MUTTLEY));
			citizenVotes.add(new CitizenVote(new Date(), "6789293661803", "Scooby Doo", Candidate.MR_BEAN));

			records.save(citizenVotes);

			Map<Candidate, Integer> voteCount = countCandidateVotes(citizenVotes);
			System.out.println("Votes for candidate" + voteCount + "\n");

			Candidate mostVotedCandidate = getMostCommonCandidate(voteCount);
			System.out.println("Elected mayor: " + mostVotedCandidate + "\n");

			List<String> nameOfTheVoters = new ArrayList<String>();
			List<String> numberOfInvalidVotes = new ArrayList<>();

			for (CitizenVote vote : citizenVotes) {

				if (vote.getCandidate() == null) {
					numberOfInvalidVotes.add(vote.getCitizenName());
					System.out.println(
							vote.getCitizenName() + " invalid vote. He has no candidate for Mayor selected." + "\n");
				}

				if (nameOfTheVoters.contains(vote.getCnp())) {
					System.out.println(vote.getCitizenName()
							+ " invalid vote. He has voted one more time. His votes will be deleted and will be fined with 5000 RON"
							+ "\n");
					numberOfInvalidVotes.add(vote.getCitizenName());

				} else {
					nameOfTheVoters.add(vote.getCnp());
				}
			}
			int validVotes = nameOfTheVoters.size() - numberOfInvalidVotes.size();
			int duplicateVoter = numberOfInvalidVotes.size();

			System.out.println("Validated votes: " + validVotes + "\n");
			System.out.println("Invalid votes: " + duplicateVoter + "\n");
		}

	}

	private static Candidate getMostCommonCandidate(Map<Candidate, Integer> inventoryCount) {
		int maxCount = 0;
		Candidate mostVotedCandidate = null;
		for (Entry<Candidate, Integer> entry : inventoryCount.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				mostVotedCandidate = entry.getKey();
			}
		}

		return mostVotedCandidate;
	}

	private static Map<Candidate, Integer> countCandidateVotes(List<CitizenVote> citizenVotes) {
		Map<Candidate, Integer> inventoryCount = new HashMap<Candidate, Integer>();
		Iterator<CitizenVote> iterator = citizenVotes.iterator();

		while (iterator.hasNext()) {
			CitizenVote p = iterator.next();
			Candidate pt = p.getCandidate();

			if (inventoryCount.containsKey(pt)) {
				int counter = inventoryCount.get(pt);
				inventoryCount.put(pt, ++counter);
			} else {
				inventoryCount.put(pt, 1);
			}
		}
		return inventoryCount;
	}

}

package ro.sci.electingapp;

/**
 * This class is where we created the citizen with date, cnp, name and candidate for mayor
 * 
 * @author Rares
 */

import java.util.Date;

public class CitizenVote {
	private Date date;
	private String cnp;
	private String citizenName;
	private Candidate candidate;

	public CitizenVote(Date date, String cnp, String citizenName, Candidate candidate) {
		this.date = date;
		this.cnp = cnp;
		this.citizenName = citizenName;
		this.candidate = candidate;

	}

	public String getCnp() {
		return cnp;
	}

	public String getCitizenName() {
		return citizenName;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "[" + date + "," + cnp + "," + citizenName + "," + candidate + "]";

	}

}

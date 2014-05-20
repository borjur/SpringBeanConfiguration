package com.boris.company;

import java.util.List;

public class Sports {

	private Team best;
	private List<Team> teams;

	public Team getBest() {
		return best;
	}

	public void setBest(Team best) {
		this.best = best;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("The best : " + best);
		sb.append("\n");
		sb.append("Others:\n");

		for (Team team : teams) {
			sb.append(team);
			sb.append("\n");
		}

		return sb.toString();
	}

}

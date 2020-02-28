package le1;

import java.util.ArrayList;

public class League {

	public String leagueName;
	public ArrayList<Team> teams = new ArrayList<>();
	
	public League(String leagueName) {
		this.leagueName = leagueName;
	}
	
	public String getName() {
		return leagueName;
	}
	
	public ArrayList<Team> getTeams() {
		return teams;
	}
	
	public void addTeam(Team t) {
		teams.add(t);
	}
	
	public void removeTeam(Team t) {
		teams.remove(t);
	}
	
	public ArrayList<Match> getMatches() {
		ArrayList<Match> matches = new ArrayList<>();
		
		for (int i = 0; i < teams.size(); i++) {
			for (int j = i + 1; j < teams.size(); j++) {
				matches.add(new Match(teams.get(i), teams.get(j)));
			}
		}
		
		return matches;
	}
	
}

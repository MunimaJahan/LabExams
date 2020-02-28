package le1;

public class Match {
	
	private Team teamOne;
	private Team teamTwo;
	
	
	
	public Match(Team teamOne, Team teamTwo) {
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	
	public Team getTeamOne() {
		return teamOne;
	}
	
	public Team getTeamTwo() {
		return teamTwo;
	}
	
	public String toString() {
		return (teamOne.getName() + " vs " + teamTwo.getName());
	}
	

}

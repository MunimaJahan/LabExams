package le1;

import java.util.ArrayList;

public class Team {

	
	

	private String teamName;
	private ArrayList<Member> members = new ArrayList<>();
	
	public Team(String teamName) {
		this.teamName = teamName;
	}
	
	public String getName() {
		return teamName;
	}
	
	public ArrayList<Member> getMembers() {
		return members;
	}
	
	public void addTeamMember(Member m) {
		members.add(m);
	}
	
	
	
	
	
}

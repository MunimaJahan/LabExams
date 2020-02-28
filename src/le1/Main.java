package le1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		League league = new League("Tuesday");
		
		Member m1 = new Member("Member 1");
		Member m2 = new Member("Member 2");
		Member m3 = new Member("Member 3");
		Member m4 = new Member("Member 4");
		Member m5 = new Member("Member 5");
		Member m6 = new Member("Member 6");
		Member m7 = new Member("Member 7");
		Member m8 = new Member("Member 8");
		
		Team t1 = new Team("T1");
		Team t2 = new Team("T2");
		Team t3 = new Team("T3");
		Team t4 = new Team("T4");
		
		t1.addTeamMember(m1);
		t1.addTeamMember(m8);
		
		t2.addTeamMember(m2);
		t2.addTeamMember(m7);
		
		t3.addTeamMember(m3);
		t3.addTeamMember(m6);
		
		t4.addTeamMember(m4);
		t4.addTeamMember(m5);
		
		league.addTeam(t1);
		league.addTeam(t2);
		league.addTeam(t3);
		league.addTeam(t4);
		
		ArrayList<Match> matches = league.getMatches();
		
		for (Match m : matches) {
			System.out.println(m.getTeamOne().getName() + " vs " +
					m.getTeamTwo().getName());
		}
		

	}

}

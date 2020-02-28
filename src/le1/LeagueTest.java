package le1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class LeagueTest {

	@Test
	public void testLeageConstructor() {
		String leagueName = "Test League";
		League league = new League(leagueName);

		assertEquals("League Constructor - name", leagueName, league.getName());
		assertTrue("Leage Constructor - empty teams", league.getTeams().isEmpty());

	}

	@Test
	public void testAddTeam() {
		Team t1 = new Team("TestTeam1");
		Team t2 = new Team("TestTeam2");

		ArrayList<Team> expectedTeams = new ArrayList<>();

		String leagueName = "Test League";
		League league = new League(leagueName);

		expectedTeams.add(t1);
		league.addTeam(t1);
		expectedTeams.add(t2);
		league.addTeam(t2);

		assertEquals("Adding Teams", expectedTeams, league.getTeams());

	}

	@Test
	public void testRemoveTeam() {
		Team t1 = new Team("TestTeam1");
		Team t2 = new Team("TestTeam2");

		ArrayList<Team> expectedTeams = new ArrayList<>();

		String leagueName = "Test League";
		League league = new League(leagueName);

		expectedTeams.add(t2);

		league.addTeam(t1);
		league.addTeam(t2);
		league.removeTeam(t1);

		assertEquals("Removing Teams", expectedTeams, league.getTeams());

	}

	@Test
	public void testGetMatches() {
		League league = new League("Tuesday");

		Team t1 = new Team("T1");
		Team t2 = new Team("T2");
		Team t3 = new Team("T3");
		Team t4 = new Team("T4");

		ArrayList<Team> teams = new ArrayList<>();
		teams.add(t1);
		teams.add(t2);
		teams.add(t3);
		teams.add(t4);

		ArrayList<Match> expectedMatches = new ArrayList<>();

		for (int i = 0; i < teams.size(); i++) {
			for (int j = i + 1; j < teams.size(); j++) {
				expectedMatches.add(new Match(teams.get(i), teams.get(j)));
			}
		}

		league.addTeam(t1);
		league.addTeam(t2);
		league.addTeam(t3);
		league.addTeam(t4);

		ArrayList<Match> actualMatches = league.getMatches();
		
		assertEquals("Match Generation", 
				expectedMatches.toString(), 
				actualMatches.toString());
		

	}

}

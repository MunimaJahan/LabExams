package le1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatchTest {

	@Test
	public void testMatchConstructor() {
		Team t1 = new Team("TestTeam1");
		Team t2 = new Team("TestTeam2");
		
		Match m = new Match(t1, t2);
		assertEquals("Match Constructor - Team 1",
				t1,
				m.getTeamOne());
		assertEquals("Match Constructor - Team 2",
				t2,
				m.getTeamTwo());
		
	}
	
	@Test
	public void testToString() {
		Team t1 = new Team("TestTeam1");
		Team t2 = new Team("TestTeam2");
		
		Match m = new Match(t1, t2);
		String expectedString = "TestTeam1 vs TestTeam2";
		assertEquals("Match toString", 
				expectedString, 
				m.toString());
	}

}

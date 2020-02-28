package le1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TeamTest {

	@Test
	public void testTeamConstructor() {
		String teamName = "Test Team";
		Team t = new Team(teamName);
		
		assertEquals("Team Constructor - name", teamName, t.getName());
		assertTrue("Team Constructor - member list empty",
				t.getMembers().isEmpty());
	}
	
	@Test
	public void testAddMember() {
		Member m1 = new Member("M1");
		Member m2 = new Member("M2");
		
		ArrayList<Member> expectedMembers = new ArrayList<>();
		
		expectedMembers.add(m1);
		expectedMembers.add(m2);
		
		String teamName = "Test Team";
		Team t = new Team(teamName);
		
		t.addTeamMember(m1);
		t.addTeamMember(m2);
		
		assertEquals("Adding Team Members", expectedMembers, t.getMembers());
	}

}

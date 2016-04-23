package team;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import player.Player;
import player.PlayerTestData;

public class TeamTest {

	@Test
	public void testAddPlayer(){
		// Setup
		Player player = PlayerTestData.createSimplePlayer();
		Team team = new Team("Test");
		
		// Test
		team.addPlayer(player);
		
		// Assert
		Assertions.assertThat(team.getPlayers()).containsExactly(player);
	}

	@Test
	public void test() {
		// Setup
		Player player = PlayerTestData.createSimplePlayer();
		Team team = new Team("Test");
		team.addPlayer(player);

		// Test
		System.out.println(team.toString());

		// Assert
	}
}

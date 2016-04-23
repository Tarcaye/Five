package team;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import player.Player;
import tactical.Tactical;

public class Team implements Serializable {

	private static final long serialVersionUID = 5466915469039303337L;

	private String name;

	private List<Player> players = new ArrayList<>();
	
	private Tactical currentTactical;

	public Team(String name) {
		this.name = name;
	}

	public void addPlayer(Player player){
		this.players.add(player);
	}

	public List<Player> getPlayers() {
		return players;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Name : ");
		stringBuilder.append(name);
		stringBuilder.append(", Players : ");
		stringBuilder.append(players);
		stringBuilder.append(", Tactical : ");
		stringBuilder.append(currentTactical);

		return stringBuilder.toString();
	}
}

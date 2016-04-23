package player;

public class Player {

	public final String lastName;
	
	public final String firstName;
	
	public final String nickname;
	
	public int number;

	public Player(String lastName, String firstName, String nickname) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder(Integer.toString(number));
		stringBuilder.append(". ");
		stringBuilder.append(lastName);
		stringBuilder.append(", ");
		stringBuilder.append(firstName);
		stringBuilder.append(" (");
		stringBuilder.append(nickname);
		stringBuilder.append(")");
		// stringBuilder.append(currentTactical.toString());

		return stringBuilder.toString();
	}
	
}

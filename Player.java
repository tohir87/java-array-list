package __arrayList;


public class Player implements Comparable<Player> {
	private String name;
	private String team;
	private int score;
	
	public Player(String team, String name, int score) {
		super();
		this.team = team;
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}	
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "\nPlayer [team=" + team + ", name=" + name + ", score=" + score + " ]";
	}
	
	@Override
	public int compareTo(Player p) {
		return this.name.compareTo(p.getName());
	}	
}

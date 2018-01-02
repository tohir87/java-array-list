package __arrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players pl = new Players();
		pl.add(new Player("gr", "Player 1", 5));
		pl.add(new Player("gr", "Player 2", 3));
		pl.add(new Player("gr", "Player 3", 7));
		pl.add(new Player("gr", "Player 3", 7));
		
		pl.display();
		
		System.out.println("...... total goals ....." + pl.totalGoals());
		
		System.out.println("...... find player ....." + pl.getPlayer("Player 2"));
		
		System.out.println("...... No of players ....." + pl.getNumPlayers());
		
		System.out.println("......update score.....");
		pl.upDateScore("Player 1", 50);
		
		pl.display();
		
		System.out.println("players in a team......" + pl.getTeam("gr"));
		
	}

}

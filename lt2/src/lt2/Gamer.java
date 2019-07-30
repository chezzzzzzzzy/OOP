package lt2;

//CHESTER YEE
//1718476
//DCPE/FT/3A/01


public class Gamer {
	
	public static void main(String args[]) {
		
		// create game objects
		Game g1 = new Game();
		Game g2 = new Game(70000.00, "PAYDAY");
		
		
		// getting game names and earnings of both objects
		System.out.println(g1.getNameOfGame());
		System.out.println(g1.getEarnings());
		
		System.out.println(g2.getNameOfGame());
		System.out.println(g2.getEarnings());
		
		// setting game names and earnings for g1 object
		g1.setNameOfGame("Restaurant city");
		g1.setEarnings(1000);
		g1.shout();
		System.out.println("The game name of g1 is " + g1.getNameOfGame() + " and the earnings is " + g1.getEarnings());
		
		// setting game names and earnings for g2 object
		g2.setNameOfGame("Crypto kitties");
		g2.setEarnings(200000);
		g2.shout();
		System.out.println("The game name of g2 is " + g2.getNameOfGame() + " and the earnings is " + g2.getEarnings());
	
	}
	

}

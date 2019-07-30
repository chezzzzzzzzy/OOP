package lt2;

//CHESTER YEE
//1718476
//DCPE/FT/3A/01

public class Game extends Gaming {
	
	
	private double earnings;
	
	public Game() {
		super("COC");
		this.earnings = 1000;
	}
	
	public Game(double earnings, String nameOfGame) {
		super(nameOfGame);
		this.earnings = earnings;
	}

	public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}
	
	
	@Override
	public void shout() {
		
		if (getEarnings() > 130000.00) {
			System.out.println("Top 100 gamers!");

		} 
		
		if (getEarnings() < 13000.00) {
			System.out.println("Average gamers!");

		}
	}
	
	

}


class Gaming {
	
	private String nameOfGame;
	
	public Gaming() {
		nameOfGame = "COC";
	}
	
	public Gaming(String gameName) {
		nameOfGame = gameName;
	}

	public String getNameOfGame() {
		return nameOfGame;
	}

	public void setNameOfGame(String nameOfGame) {
		this.nameOfGame = nameOfGame;
	}
	
	
	public void shout() {
		System.out.println(nameOfGame);
	}
	
	
	

}


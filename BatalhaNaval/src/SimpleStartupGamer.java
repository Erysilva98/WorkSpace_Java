// Aula 10/03/2023

public class SimpleStartupGamer {

	public static void main(String[] args) {
		
		int numOfGuesses = 0;
		boolean inAlive = true;
		
		GameHelper helper = new GameHelper();
		
		SimpleStartup theStartup = new SimpleStartup();
		
		int randomNum = (int) (Math.random() * 5);
		
		int[] locations = {randomNum, randomNum + 1, randomNum +2};
		
		theStartup.setLocationsCells(locations);
		
		while(inAlive)
		{
			int guess = helper.getUserInput("enter = number");
			String result = theStartup.checkYourself(guess);
			
			numOfGuesses++;
			
			if(result.equals("kill"))
			{
				inAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
		
		
	}
}

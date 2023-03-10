// Aula 10/03/2023

public class SimpleStartUpTestDrive {

	public static void main(String[] args) {
		// Aula 10/03/2023
		
		SimpleStartup dot = new SimpleStartup();
		
		int[] locations = { 2, 3, 4 };
		String result;
		String testResult;
		
		dot.setLocationsCells(locations);
		int userGuess = 2;
		result = dot.checkYourself(userGuess);
		testResult = "falied";
		
		if(result.equals("hit"))
		{
			testResult = "passed";
		}
		System.out.println(testResult);
	}

}

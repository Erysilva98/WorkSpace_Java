
public class SimpleStartup {
	private int [] LocationsCells;
	private int numOfHits = 0;
	
	public void setLocationsCells( int [] locs)
	{
		LocationsCells = locs;
	}
	
	public String checkYourself(int guess)
	{
		String result = "miss";
		
		for(int cell : LocationsCells)
		{
			if(guess == cell) 
			{
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if (numOfHits == LocationsCells.length)
		{
			result = "kill";
		}
		
		System.out.println(result);
		return result;
	}
}

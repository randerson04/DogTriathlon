//excercise on pages 270-272

public class DogTri
{
	//data field vars for this class
	private final int NUM_EVENTS;
	//this static field var is shared by ALL objects in this class
	private static int totalCumulativeScore = 0;
	//data field vars for an object from this class
	private String name;
	private int obedienceScore;
	private int conformationScore;
	private int agilityScore;
	private int total;
	private double avg;
	private boolean doScoresAgree;

	//constructor method for this class
	public DogTri(String name, int numEvents, int score1, int score2, int score3)
	{
		this.name = name;
		NUM_EVENTS = numEvents;
		int totalNot0 = 0;
		//check the parameters to see if there are any zero scores
		if(score1 != 0)
		{
			totalNot0 = totalNot0 + 1;

		}
		if(score2 != 0)
		{
			totalNot0 = totalNot0 + 1;

		}
		if(score3 != 0)
		{
			totalNot0 = totalNot0 + 1;

		}

		//compare the totalNot0 value to the NUM_EVENTS value
		if(NUM_EVENTS == totalNot0)
		{
			doScoresAgree = true; 
		}
		else
		{
			doScoresAgree = false; 
		}

		//if doScoreAgree is true, assign the scores to the fields. If not, give all zeros. 
		if(doScoresAgree)
		{
			obedienceScore = score1;
			conformationScore = score2;
			agilityScore = score3;
		}
		else 
		{
			obedienceScore = 0;
			conformationScore = 0;
			agilityScore = 0;
		}
		total = obedienceScore + conformationScore + agilityScore;
		//determine if the dogg did not participate in ANY events
		if(NUM_EVENTS == 0)
		{
			avg = 0;
		}
		else
		{
			avg = (double) total / NUM_EVENTS;
		}
		totalCumulativeScore = totalCumulativeScore + total; 
	}

	public void display()
	{
		//if doScoresAgree is false output a speical message
		if(!doScoresAgree)
		{
			System.out.println("\n NOTICE! number of events for " + name + " does not agree with the scores reported!");
		}
		System.out.println(name + " participated " + NUM_EVENTS + " events and has an average score of " + avg); 
		System.out.println(" " + name + " has a total score of " + total + "bringing the total cumulative score to " + totalCumulativeScore);
		System.out.println();
	}
}
package edu.unca.CSCI202;

/**
 * @author 		Johnny Remein
 * @version		2/25/19
 * Assignment:	Project 2 - A Media Class Hierarchy
 * Description: The Audio class extends TimedMedium and is used for representing media types that are only audio.
 * 				It does not add any additional fields to what is inherited.
 * 
 */
public class Audio extends TimedMedium{

	public Audio(String title, String creator, int year, Time runTime) {
		super(title, creator, year, runTime);
		type = "audio" + type;
	}

	@Override
	public String toString() {
		return "  Audio: \nTitle = " + title + "\nCreator = " + creator + "\nYear = " + year + "\nRun time = " + runTime.toString() + "\n";
	}

	
	
	
}

package edu.unca.CSCI202;
import java.util.ArrayList;

/**
 * @author 		Johnny Remein
 * @version		2/25/19
 * Assignment:	Project 2 - A Media Class Hierarchy
 * Description: The MediumDriver class is responsible for testing all of the methods for every class in the program. the main
 * 				method is housed in this class which dictates the order of testing and creates an ArrayList of every
 * 				different type of concrete class which is both used for testing and printed out to the user once testing
 * 				is concluded
 * 
 */
public class MediumDriver {

	/**
	 * @param args
	 * Description: the main method dictates the order of testing and creates an ArrayList of every
	 * 				different type of concrete class which is both used for testing and printed out to the user once testing
	 * 				is concluded
	 */
	public static void main(String[] args) {

		MediumDriver test = new MediumDriver();
		ArrayList<Medium> media = new ArrayList<Medium>();
		ArrayList<Medium> testMediumList = new ArrayList<Medium>();

		
		test.fillList(media);
		test.fillList(testMediumList);
		test.testMedium(media, testMediumList);
		test.testAudio();
		test.testPrint();
		test.testVideo();
		test.testTime();
		
		System.out.println("\n*******************************\nFinal Print:\n*******************************");
		test.printMedia(media);
		
	}
	
	/**
	 * 
	 * @param media - an ArrayList<Medium> to have media types added to it
	 * Description:	The fillList method puts three different media types into an ArrayList
	 */
	public void fillList(ArrayList<Medium> media) {
		media.add(new Print("Hokus Pokus", "Kurt Vonnegut", 1990, 324));
		media.add(new Video("A Clockwork Orange", "Stanley Kubrick", 1971, new Time(2, 16, 0), "1080p"));
		media.add(new Audio("Good Kid, M.A.A.D City", "Kendrick Lamar", 2012, new Time(1, 8, 23)));
	}
	
	/**
	 * 
	 * @param media				- an ArrayList<Medium> to act as a control for testing
	 * @param testMediumList	- an ArrayList<Medium> to be changed for testing
	 * Description:	The testMedium method tests all of the methods that are common to every type of media
	 */
	public void testMedium(ArrayList<Medium> media, ArrayList<Medium> testMediumList) {
				
		System.out.println("\n*************************************************\nTesting Methods Common to All Medium Subclasses:\n*************************************************\n");
		
		System.out.println("Testing getters:");
		for(Medium temp : media)
			System.out.println("Title = " + temp.getTitle() + ", creator = " + temp.getCreator() + ", year = " + temp.getYear() + "\n");
		
		testEquals(media, testMediumList);
		
		System.out.println("\nTesting setters:");
		for(Medium temp : testMediumList) {
			temp.setCreator("Test");
			temp.setTitle("Test");
			temp.setYear(1337);
		}
		printMedia(testMediumList);
		testEquals(media, testMediumList);
		
		System.out.println("\nTesting hashcode() methods:");
		for(Medium temp : media)
			System.out.println(temp.getTitle() + ": " + temp.hashCode());
		for(Medium temp : testMediumList)
			System.out.println(temp.getTitle() + ": " + temp.hashCode());

		
	}
	
	/**
	 * 
	 * @param media	- an ArrayList<Medium> 
	 * @param test	- an ArrayList<Medium>
	 * Description: The testEquals method tests two ArrayList<Medium>s for equality of each corresponding element
	 */
	public void testEquals(ArrayList<Medium> media, ArrayList<Medium> test) {
		System.out.println("Testing equals() methods:");
		for(int i = media.size() - 1; i >= 0; i--)
			if(media.get(i).equals(test.get(i)))
				System.out.println("They're the same");
			else 
				System.out.println("They're not the same");
	}
	
	/**
	 * Description: The testAudio method tests the methods that are specific to the media type represented by the Audio class.
	 */
	public void testAudio() {
		Audio audio = new Audio("Good Kid, M.A.A.D City", "Kendrick Lamar", 2012, new Time(1, 8, 23));
		Audio audioTest = new Audio("Good Kid, M.A.A.D City", "Kendrick Lamar", 2012, new Time(1, 8, 23));
		System.out.println("\n*******************************\nTesting Audio:\n*******************************\n");
		
		if(audio.equals(audioTest))
			System.out.println("They're the same");
		else
			System.out.println("They're not the same");
		
		System.out.println("Run Time = " + audio.getTime());
		System.out.println("Test Run Time = " + audioTest.getTime());
		
		audioTest.setTime(new Time(0, 0, 0));
		
		System.out.println("Run Time = " + audio.getTime());
		System.out.println("Test Run Time = " + audioTest.getTime());
	
		if(audio.equals(audioTest))
			System.out.println("They're the same");
		else
			System.out.println("They're not the same");
		
		System.out.println("Hashcodes:");
		System.out.println(audio.hashCode());
		System.out.println(audioTest.hashCode());
	}
	
	/**
	 * Description: The testPrint method tests the methods that are specific to the media type represented by the Print class.
	 */
	public void testPrint() {
		Print print = new Print("Hokus Pokus", "Kurt Vonnegut", 1990, 324);
		Print printTest = new Print("Hokus Pokus", "Kurt Vonnegut", 1990, 324);
		System.out.println("\n*******************************\nTesting Print\n*******************************\n");
		
		if(print.equals(printTest))
			System.out.println("They're the same");
		else
			System.out.println("They're not the same");
		
		System.out.println("Pages = " + print.getNumPages());
		System.out.println("Test Pages = " + printTest.getNumPages());
		
		printTest.setNumPages(0);
		
		System.out.println("Pages = " + print.getNumPages());
		System.out.println("Test Pages = " + printTest.getNumPages());
	
		if(print.equals(printTest))
			System.out.println("They're the same");
		else
			System.out.println("They're not the same");
		
		System.out.println("Hashcodes:");
		System.out.println(print.hashCode());
		System.out.println(printTest.hashCode());
	}
	
	/**
	 * Description: The testVideo method tests the methods that are specific to the media type represented by the Video class.
	 */
	public void testVideo() {
		Video video = new Video("A Clockwork Orange", "Stanley Kubrick", 1971, new Time(2, 16, 0), "1080p");
		Video videoTest = new Video("A Clockwork Orange", "Stanley Kubrick", 1971, new Time(2, 16, 0), "1080p");
		System.out.println("\n*******************************\nTesting Video\n*******************************\n");
		
		if(video.equals(videoTest))
			System.out.println("They're the same");
		else
			System.out.println("They're not the same");
		
		System.out.println("Resolution = " + video.getResolution());
		System.out.println("Test Resolution = " + videoTest.getResolution());
		
		videoTest.setResolution("Straight Garbage");
		
		System.out.println("Resolution = " + video.getResolution());
		System.out.println("Test Resolution = " + videoTest.getResolution());
	
		if(video.equals(videoTest))
			System.out.println("They're the same");
		else
			System.out.println("They're not the same");
		
		System.out.println("Hashcodes:");
		System.out.println(video.hashCode());
		System.out.println(videoTest.hashCode());
	}
	
	/**
	 * Description: The testTime method tests the methods that are specific to the Time class.
	 */
	public void testTime() {
		Video timeTest = new Video("A Clockwork Orange", "Stanley Kubrick", 1971, new Time(2, 16, 0), "1080p");
		Audio audio = new Audio("Good Kid, M.A.A.D City", "Kendrick Lamar", 2012, new Time(1, 8, 23));
		Time timeT = new Time(1, 8, 23);
		System.out.println("\n*******************************\nTesting Time\n*******************************\n");
		
		System.out.println("Testing getters, to string and total seconds:");
		System.out.println("hours: " + audio.getTime().getHours() + "\nminutes: " + audio.getTime().getMinutes() + "\nseconds: " + audio.getTime().getSeconds());
		System.out.println(audio.getTime().toString());
		System.out.println("total seconds: " + audio.getTime().getSecondsTotal());
		
		System.out.println("\nTesting equals():");
		if(audio.getTime().equals(timeT))
			System.out.println("Check! It works");
		else 
			System.out.println("Uh oh, something isn't right");
		
		if(!audio.getTime().equals(timeTest.getTime()))
			System.out.println("Check! It works");
		else
			System.out.println("Uh oh, something isn't right");
		
		System.out.println("\nTesting hashcode():");
		System.out.println(timeTest.getTime().hashCode() + "\n" + audio.getTime().hashCode() + "\n" + timeT.hashCode());
	}
	
	/**
	 * @param media	- an ArrayList<Medium> to be printed
	 * Description: the printMedia method prints out the individual elements of an ArrayList of type Medium.
	 */
	public void printMedia(ArrayList<Medium> media) {
		System.out.println();
		for(Medium temp : media) 
			System.out.println(temp.toString());
	}

}

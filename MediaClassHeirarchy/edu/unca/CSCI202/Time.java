package edu.unca.CSCI202;

/**
 * @author 		Johnny Remein
 * @version		2/25/19
 * Assignment:	Project 2 - A Media Class Hierarchy
 * Description: The Time class represents the length of media that extends TimedMedium in hours minutes and seconds. 
 * 				It also contains a method to display the total time in seconds.
 * 				
 */
public class Time {
	public final static int secInHour = 3600;
	public final static int	secInMinute = 60;
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public int getSecondsTotal() {
		return hours*secInHour + minutes*secInMinute + seconds;
	}
	@Override
	public String toString() {
		return hours + "h " + minutes + "min " + seconds + "secs";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}
	
	
	
	
	
	

}

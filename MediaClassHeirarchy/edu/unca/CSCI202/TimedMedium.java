package edu.unca.CSCI202;

/**
 * @author 		Johnny Remein
 * @version		2/25/19
 * Assignment:	Project 2 - A Media Class Hierarchy
 * Description: The TimedMedium class is an abstract class that provides the most general methods and fields for different 
 * 				types of timed media, such as audio and video media. In addition to the fields inherited, TimedMedium 
 * 				contains a field that represents the length in time of the media.
 * 
 */
public abstract class TimedMedium extends Medium{

	protected Time runTime;

	
	public TimedMedium(String title, String creator, int year, Time runTime) {
		super(title, creator, year);
		this.runTime = runTime;
		type = "timed" + type;
	}
	
	public Time getTime() {
		return runTime;
	}
	public void setTime(Time runTime) {
		this.runTime = runTime;
	}

	@Override
	public String toString() {
		return "Title=" + title + ", creator=" + creator + ", year=" + year + ", Run time= " + runTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((runTime == null) ? 0 : runTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TimedMedium other = (TimedMedium) obj;
		if (runTime == null) {
			if (other.runTime != null)
				return false;
		} else if (!runTime.equals(other.runTime))
			return false;
		return true;
	}
	
}

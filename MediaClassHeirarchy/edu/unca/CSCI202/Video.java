package edu.unca.CSCI202;

/**
 * @author 		Johnny Remein
 * @version		2/25/19
 * Assignment:	Project 2 - A Media Class Hierarchy
 * Description: The Video class extends TimedMedium and represents media in the form of video. In addition to what is inherited,
 * 				it includes a field for the resolution of the video.
 * 
 */
public class Video extends TimedMedium{
	
	protected String resolution;

	public Video(String title, String creator, int year, Time runTime, String resolution) {
		super(title, creator, year, runTime);
		this.resolution = resolution;
		type = "video" + type;
	}

	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		return "  Video: \nTitle = " + title + "\nCreator = " + creator
				+ "\nYear = " + year + "\nResolution = " + resolution + "\nRun time = " + runTime.toString() + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((resolution == null) ? 0 : resolution.hashCode());
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
		Video other = (Video) obj;
		if (resolution == null) {
			if (other.resolution != null)
				return false;
		} else if (!resolution.equals(other.resolution))
			return false;
		return true;
	}
	
	
	
	
}

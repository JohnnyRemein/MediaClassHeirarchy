package edu.unca.CSCI202;

/**
 * @author 		Johnny Remein
 * @version		2/25/19
 * Assignment:	Project 2 - A Media Class Hierarchy
 * Description: The Medium class is an abstract class that provides the most general methods and fields for different types of 
 * 				media.
 * 
 */
public abstract class Medium {

	protected String title;
	protected String creator;
	protected int year;
	protected String type;
	
	
	public Medium(String title, String creator, int year) {
		this.title = title;
		this.creator = creator;
		this.year = year;
		type = "media";
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Title = " + title + ", creator = " + creator + ", year = " + year;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
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
		Medium other = (Medium) obj;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
		
}

package edu.unca.CSCI202;

/**
 * @author 		Johnny Remein
 * @version		2/25/19
 * Assignment:	Project 2 - A Media Class Hierarchy
 * Description: The Print class extends the abstract class Medium and is used to represent written media such as books
 * 				or magazines. In addition to what it has inherited it contains a field for the number of pages.
 * 
 */
public class Print extends Medium{
	
	protected int numPages;

	
	public Print(String title, String creator, int year, int numPages) {
		super(title, creator, year);
		this.numPages = numPages;
		type = "print" + type;
	}


	public int getNumPages() {
		return numPages;
	}
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}


	@Override
	public String toString() {
		return "  Print: \nTitle = " + title + "\nCreator = " + creator + "\nYear = " + year + "\nPages = " + numPages + "\n";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numPages;
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
		Print other = (Print) obj;
		if (numPages != other.numPages)
			return false;
		return true;
	}
	
	
}

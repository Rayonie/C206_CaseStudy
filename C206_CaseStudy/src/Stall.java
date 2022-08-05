/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Bryan Yue Wai Zun
 * Student ID: 21012434
 * Class: E66K
 * Date/Time created: Thursday 05-08-2022 11.27
 */

/**
 * @author Bryan
 *
 */
public class Stall {
	private int stallId;
	private String stallName;

	public Stall(int stallId, String stallName) {
		super();
		this.stallId = stallId;
		this.stallName = stallName;
	}

	public int getStallId() {
		return stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

}

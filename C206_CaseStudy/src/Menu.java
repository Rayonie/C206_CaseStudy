/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Hau Yong Tian Ben
 * Student ID: 21045028
 * Class: W64P
 * Date/Time created: Thursday 04-08-2022 18:48
 */

/**
 * @author Ben
 *
 */
public class Menu extends Stall{
	private String foodname;
	private int foodprice;
	

	public Menu( int stallId,String stallName,String foodname, int foodprice) {
		super(stallId,stallName);
		this.foodname = foodname;
		this.foodprice = foodprice;
	}


	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public int getFoodprice() {
		return foodprice;
	}

	public void setFoodprice(int foodprice) {
		this.foodprice = foodprice;
	}
	
	

}

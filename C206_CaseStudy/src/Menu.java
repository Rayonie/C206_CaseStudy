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
public class Menu {
	private int foodid;
	private String foodname;
	private int foodprice;
	

	public Menu(int foodid, String foodname, int foodprice) {
		super();
		this.foodid = foodid;
		this.foodname = foodname;
		this.foodprice = foodprice;
	}

	public int getFoodid() {
		return foodid;
	}


	public void setFoodid(int foodid) {
		this.foodid = foodid;
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

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Arun Bhattarai
 * Student ID: 21015801
 * Class: W64P
 * Date/Time created: Monday 05-08-2022 09:28
 */

/**
 * @author Arun
 *
 */

public class Promotion {
	private String food;
	private boolean promotionStatus;
	private double discountedPrice;
	private int price;
	private int stallId;
	

	public Promotion(int stallid, String food, int price, boolean promotionStatus, double discountedPrice) {
		super();
		this.promotionStatus = promotionStatus;
		this.discountedPrice = discountedPrice;
	}


	/**
	 * @return the food
	 */
	public String getFood() {
		return food;
	}


	/**
	 * @param food the food to set
	 */
	public void setFood(String food) {
		this.food = food;
	}


	/**
	 * @return the promotionStatus
	 */
	public boolean isPromotionStatus() {
		return promotionStatus;
	}


	/**
	 * @param promotionStatus the promotionStatus to set
	 */
	public void setPromotionStatus(boolean promotionStatus) {
		this.promotionStatus = promotionStatus;
	}


	/**
	 * @return the discountedPrice.
	 */
	public double getDiscountedPrice() {
		return discountedPrice;
	}


	/**
	 * @param discountedPrice the discountedPrice to set
	 */
	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}


	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}


	/**
	 * @return the stallId
	 */
	public int getStallId() {
		return stallId;
	}


	/**
	 * @param stallId the stallId to set
	 */
	public void setStallId(int stallId) {
		this.stallId = stallId;
	}
}

	
	
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
	private float discountedPrice;
	

	public Promotion(String food, boolean promotionStatus, float discountedPrice) {
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
	public float getDiscountedPrice() {
		return discountedPrice;
	}


	/**
	 * @param discountedPrice the discountedPrice to set
	 */
	public void setDiscountedPrice(float discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	
	
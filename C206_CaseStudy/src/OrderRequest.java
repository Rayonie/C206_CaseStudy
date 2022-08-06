/*
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Student Name: Chan Rou Hui
 * Student ID: 21016163
 * Class: W64L
 * Date/Time created: Monday 11-8-2021 15:00
 */

/**
 * @author Rou Hui
 *
 */
public class OrderRequest {
	private int stallid;
	private String ingredientname;
	private int quantity;
	private String date;
	private int requestid;

	public OrderRequest(int requestid, int stallid, String ingredientname, int quantity, String date) {
		super();
		this.requestid = requestid;
		this.stallid = stallid;
		this.ingredientname = ingredientname;
		this.quantity = quantity;
		this.date = date;
	}
	
	public int getStallid() {
		return stallid;
	}

	public void setStallid(int stallid) {
		this.stallid = stallid;
	}

	public int getrequestid() {
		return requestid;
	}

	public void setrequestid(int requestid) {
		this.requestid = requestid;
	}

	public String getingredientname() {
		return ingredientname;
	}

	public void setingredientname(String ingredientname) {
		this.ingredientname = ingredientname;
	}

	public int getquantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

	public String getdate() {
		return date;
	}

}

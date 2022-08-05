import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
	private int requestid;
	private String ingredientname;
	private int quantity;
	

	public OrderRequest(int requestid, String ingredientname, int quantity) {
		super();
		this.requestid = requestid;
		this.ingredientname = ingredientname;
		this.quantity = quantity;
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
	
	

}

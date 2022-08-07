import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		ArrayList<Stall> stallList = new ArrayList<Stall>();
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		ArrayList<OrderRequest> orList = new ArrayList<OrderRequest>();
		stallList.add(new Stall(1, "Rice"));
		stallList.add(new Stall(2, "Noodles"));

		menuList.add(new Menu("Mixed rice", 5));
		menuList.add(new Menu("Bee hoon", 7));

		DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		Calendar obj = Calendar.getInstance();
		String str = formatter.format(obj.getTime());
		orList.add(new OrderRequest(1, 1, "Cai Xin", 30, str));
		orList.add(new OrderRequest(2, 2, "Noodles", 45, str));

		int option = 0;

		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items

				C206_CaseStudy.viewAllStall(stallList);
				C206_CaseStudy.viewAllMenu(menuList);
				C206_CaseStudy.viewAllOrderRequest(orList);

			} else if (option == 2) {
				// Add a new item
				C206_CaseStudy.setHeader("ADD");
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Stall");
				System.out.println("2. Menu");
				System.out.println("3. Request Orders");

				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Add Stalla
					Stall stall1 = inputStall();
					C206_CaseStudy.addStall(stallList, stall1);
					System.out.println("Stall added");

				} else if (itemType == 2) {
					// Add Menu
					Menu food1 = inputMenu();
					C206_CaseStudy.addMenu(menuList, food1);
					System.out.println("Menu added");

				} else if (itemType == 3) {
					// Add Order Request
					OrderRequest order1 = inputOrderRequest(orList);
					C206_CaseStudy.addOrderRequest(orList, order1);

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 3) {
				// Delete a new item
				C206_CaseStudy.setHeader("DELETE");
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Stall");
				System.out.println("2. Menu");
				System.out.println("3. Order Request");

				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Delete Stall
					int id = Helper.readInt("Enter order ID > ");
					Stall stall1 = stallList.get(id - 1);
					C206_CaseStudy.deleteStall(stallList, stall1);
					System.out.println("Stall Deleted");

				} else if (itemType == 2) {
					// Add Menu
					int id = Helper.readInt("Enter Food ID > ");
					Menu food1 = menuList.get(id - 1);
					C206_CaseStudy.deleteMenu(menuList, food1);
					System.out.println("Menu Deleted");

				} else if (itemType == 3) {
					// Delete Order Request
					int id = Helper.readInt("Enter Request ID > ");
					// OrderRequest order1 = orList.get(id - 1);
					C206_CaseStudy.deleteOrderRequest(orList, id);
					System.out.println("Order Request Deleted");

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 4) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

	/**
	 * @return
	 */
	private static Stall inputStall() {
		// TODO Auto-generated method stub
		int stallId = Helper.readInt("Enter Stall ID > ");
		String stallName = Helper.readString("Enter Stall name > ");
		Stall stall = new Stall(stallId, stallName);
		return stall;
	}

	public static void menu() {
		C206_CaseStudy.setHeader("Canteen APP");
		System.out.println("1. Display Options");
		System.out.println("2. Add item");
		System.out.println("3. Delete item");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static String retrieveAllMenu(ArrayList<Menu> menuList) {
		String output = "";

		for (int i = 0; i < menuList.size(); i++) {

			output += String.format("%-10d %-30s %-10d\n", i + 1, menuList.get(i).getFoodname(),
					menuList.get(i).getFoodprice());
		}
		return output;
	}

	public static void viewAllMenu(ArrayList<Menu> menuList) {
		C206_CaseStudy.setHeader("Menu LIST");
		String output = String.format("%-10s %-30s %-10s\n", "FOOD ID", "FOOD NAME", "PRICE");
		output += retrieveAllMenu(menuList);
		System.out.println(output);
	}

	public static Menu inputMenu() {
		String name = Helper.readString("Enter Food name > ");
		int price = Helper.readInt("Enter Price  > ");

		Menu food = new Menu(name, price);
		return food;

	}

	public static void addMenu(ArrayList<Menu> menuList, Menu food) {
		if (food.getFoodprice() <= 15 && food.getFoodprice() >= 3) {
			menuList.add(food);
		} else {
			System.out.println("Price must be below 15 and above 3");
		}

	}

	public static void deleteMenu(ArrayList<Menu> menuList, Menu food) {
		if (menuList.isEmpty()) {
			System.out.println("There is nothing to delete");
		} else {
			menuList.remove(food);
		}

	}

	public static void addOrderRequest(ArrayList<OrderRequest> orList, OrderRequest order) {
		int repeat = 0;
		for (int i = 0; i < orList.size(); i++) {
			if (orList.get(i).getStallid() == order.getStallid()
					&& orList.get(i).getrequestid() != order.getrequestid()) {
				repeat = repeat + 1;
			}
		}
		if (repeat >= 2) {
			System.out.println("There is already more than 2 request order from the same store");
		} else {
			orList.add(order);
			System.out.println("Order Request added");
		}
	}

	public static OrderRequest inputOrderRequest(ArrayList<OrderRequest> orList) {
		int checkid = 0;
		for (int i = 0; i < orList.size(); i++) {
			checkid = orList.size() + 1;
			while (checkid == orList.get(i).getrequestid()) {
				checkid = checkid + 1;
			}
		}
		int requestid = checkid;
		int id = Helper.readInt("Enter stall ID > ");
		
		String name = "";
		boolean checkName = true;
		while (checkName != false) {
			name = Helper.readString("Enter name of ingredient  > ");
			try {
				Integer.parseInt(name);
				System.out.println("Input name must be string!!!");
				checkName = true;
			} catch (NumberFormatException e) {
				checkName = false;
			}
		}
		
		int quantity = Helper.readInt("Enter quantity > ");

		DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		Calendar obj = Calendar.getInstance();
		String str = formatter.format(obj.getTime());
		OrderRequest order = new OrderRequest(requestid, id, name, quantity, str);
		return order;

	}

	public static String retrieveAllOrderRequest(ArrayList<OrderRequest> orList) {
		String output = "";
		for (int i = 0; i < orList.size(); i++) {
			output += String.format("%-15d %-15d %-25s %-20d %-10s\n", orList.get(i).getrequestid(),
					orList.get(i).getStallid(), orList.get(i).getingredientname(), orList.get(i).getquantity(),
					orList.get(i).getdate());
		}

		return output;
	}

	private static void viewAllOrderRequest(ArrayList<OrderRequest> orList) {
		C206_CaseStudy.setHeader("Request Order LIST");
		String output = String.format("%-15s %-15s %-25s %-20s %-10s\n", "REQUEST ID", "STALL ID", "INGREDIENT NAME",
				"QUANTITY", "DATE");
		output += retrieveAllOrderRequest(orList);
		System.out.println(output);

	}

	public static void deleteOrderRequest(ArrayList<OrderRequest> orList, int order) {

			if (!(orList.isEmpty())) {

				for (int i = 0;i < orList.size();i++) {
					if(order == orList.get(i).getrequestid()) {

						orList.remove(i);
					}
				}
				
			} else {
				System.out.println("There is nothing to delete");
			}
	}

	public static void addStall(ArrayList<Stall> stallList, Stall stall) {
		// TODO Auto-generated method stub.
		if (stall.getStallId() < 10) {
			stallList.add(stall);
		} else {
			System.out.println("Maximum stalls in canteen is 10");
		}
	}

	public static String retrieveAllStall(ArrayList<Stall> stallList) {
		// TODO Auto-generated method stub
		String output = "";

		for (int i = 0; i < stallList.size(); i++) {

			output += String.format("%-10s %-30s\n", stallList.get(i).getStallId(), stallList.get(i).getStallName());
		}
		return output;
	}

	private static void viewAllStall(ArrayList<Stall> stallList) {
		// TODO Auto-generated method stub
		C206_CaseStudy.setHeader("Stall LIST");
		String output = String.format("%-10s %-30s\n", "STALL ID", "STALL NAME");
		output += retrieveAllStall(stallList);
		System.out.println(output);

	}

	public static void deleteStall(ArrayList<Stall> stallList, Stall stall) {
		// TODO Auto-generated method stub
		if (stallList.isEmpty()) {
			System.out.println("There is nothing to delete");
		} else {
			stallList.remove(stall);
		}
	}

}

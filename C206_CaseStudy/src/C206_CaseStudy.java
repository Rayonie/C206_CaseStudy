import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		ArrayList<OrderRequest> orList = new ArrayList<OrderRequest>();
		menuList.add(new Menu("Mixed rice", 5));
		menuList.add(new Menu("Bee hoon", 7));

		orList.add(new OrderRequest(1, "Cai Xin", 30, null));
		orList.add(new OrderRequest(2, "Noodles", 45, null));

		int option = 0;

		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items

				C206_CaseStudy.viewAllMenu(menuList);
				C206_CaseStudy.viewAllOrderRequest(orList);

			} else if (option == 2) {
				// Add a new item
				C206_CaseStudy.setHeader("ADD");
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Menu");
				System.out.println("2. Request Orders");

				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Add Menu
					Menu food1 = inputMenu();
					C206_CaseStudy.addMenu(menuList, food1);
					System.out.println("Menu added");

				} else if (itemType == 2) {
					// Add Order Request
					OrderRequest order1 = inputOrderRequest();
					C206_CaseStudy.addOrderRequest(orList, order1);
					System.out.println("Order Request added");

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 3) {
				// Delete a new item
				C206_CaseStudy.setHeader("DELETE");
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Menu");
				System.out.println("2. Order Request");

				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Add Menu
					int id = Helper.readInt("Enter Food ID > ");
					Menu food1 = menuList.get(id - 1);
					C206_CaseStudy.deleteMenu(menuList, food1);
					System.out.println("Menu Deleted");

				} else if (itemType == 2) {
					// Delete Order Request
					int id = Helper.readInt("Enter Stall ID > ");
					OrderRequest order1 = orList.get(id - 1);
					C206_CaseStudy.deleteOrderRequest(orList, order1);
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
	 * @param orList
	 */

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
		if (order.getStallid() <= 2) {
			orList.add(order);
		} else {
			System.out.println("Unable to add. You have reach maximum amount of 2 orders per week.");
		}
	}

	public static OrderRequest inputOrderRequest() {
		int id = Helper.readInt("Enter stall ID > ");
		String name = Helper.readString("Enter name of ingredient  > ");
		int quantity = Helper.readInt("Enter quantity > ");
		String date = Helper.readString("Enter date > ");

		OrderRequest order = new OrderRequest(id, name, quantity, date);
		return order;

	}

	public static String retrieveAllOrderRequest(ArrayList<OrderRequest> orList) {
		String output = "";

		for (int i = 0; i < orList.size(); i++) {

			output += String.format("%-20d %-40s %-10d\n", orList.get(i).getStallid(),
					orList.get(i).getingredientname(), orList.get(i).getquantity());
		}

		return output;
	}

	private static void viewAllOrderRequest(ArrayList<OrderRequest> orList) {
		C206_CaseStudy.setHeader("Request Order LIST");
		String output = String.format("%-20s %-40s %-10s\n", "STALL ID", "INGREDIENT NAME", "QUANTITY", "DATE");
		output += retrieveAllOrderRequest(orList);
		System.out.println(output);

	}

	public static void deleteOrderRequest(ArrayList<OrderRequest> orList, OrderRequest order) {
		if (orList.isEmpty()) {
			System.out.println("There is nothing to delete");
		} else {
			orList.remove(order);
		}

	}

	/**
	 * @param stallList
	 * @param stall1
	 */
	public static void addStall(ArrayList<Stall> stallList, Stall stall) {
		// TODO Auto-generated method stub
		if(stall.getStallId() < 10) {
			stallList.add(stall);
		}else {
			System.out.println("Maximum stalls in canteen is 10");
		}
	}
}

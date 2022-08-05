import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		ArrayList<OrderRequest> orList = new ArrayList<OrderRequest>();
		menuList.add(new Menu("Mixed rice", 5));
		menuList.add(new Menu("Bee hoon", 7));
		
		orList.add(new OrderRequest(1, "Cai Xin", 30));
		orList.add(new OrderRequest(2, "Noodles", 45));
		
		int option = 0;

		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				
				C206_CaseStudy.viewAllMenu(menuList);

			} else if (option == 2) {
				// Add a new item.
				C206_CaseStudy.setHeader("ADD");			
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Menu");
				
				C206_CaseStudy.setHeader("ADD");			
				C206_CaseStudy.setHeader("REQUEST ORDERS");
				System.out.println("2. Request Orders");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Add Menu
					Menu food1 = inputMenu();
					C206_CaseStudy.addMenu(menuList, food1);
					System.out.println("Menu added");

				} else if (itemType == 2) {
					

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 3) {
				// Delete a new item
				C206_CaseStudy.setHeader("DELETE");			
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Menu");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Add Menu
					int id = Helper.readInt("Enter Food ID > ");
					Menu food1 = menuList.get(id-1);
					C206_CaseStudy.deleteMenu(menuList, food1);
					System.out.println("Menu Deleted");

				} else if (itemType == 2) {
					

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 4) {
				

			} else if (option == 5) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

	public static void menu() {
		C206_CaseStudy.setHeader("Canteen APP");
		System.out.println("1. Display Options");
		System.out.println("2. Add item");
		System.out.println("3. Delete item");
		System.out.println("5. Quit");
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

			output += String.format("%-10d %-30s %-10d\n", i+1,
					menuList.get(i).getFoodname(),menuList.get(i).getFoodprice());
		}
		return output;
	}
	public static void viewAllMenu(ArrayList<Menu> menuList) {
		C206_CaseStudy.setHeader("Menu LIST");
		String output = String.format("%-10s %-30s %-10s\n", "FOOD ID", "FOOD NAME",
				"PRICE"	);
		 output += retrieveAllMenu(menuList);	
		System.out.println(output);
	}

	public static Menu inputMenu() {
		String name = Helper.readString("Enter Food name > ");
		int price = Helper.readInt("Enter Price  > ");

		Menu food= new Menu(name, price);
		return food;
		
	}
	public static void addMenu(ArrayList<Menu> menuList, Menu food) {
		
		menuList.add(food);
		
	}
public static void deleteMenu(ArrayList<Menu> menuList, Menu food) {
		
		menuList.remove(food);
		
	}
	

	/**
	 * @param orList
	 * @param order1
	 */
	public static void addOrderRequest(ArrayList<OrderRequest> orList, OrderRequest order1) {
		// TODO Auto-generated method stub.
		
	}

	/**
	 * @param orList
	 * @return
	 */
	public static String retrieveAllOrderRequest(ArrayList<OrderRequest> orList) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}

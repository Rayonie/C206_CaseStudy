import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Menu food1;
	private Menu food2;
	private Menu food3;
	
	private ArrayList<Menu> menuList;

	@Before
	public void setUp() throws Exception {
		food1 = new Menu(1, "Chicken Rice", 15);
		food2 = new Menu(2, "Hokkien Mee", 7);
		food3 = new Menu(3, "Chicken Nugget", 3);
		
		menuList= new ArrayList<Menu>();
	}
	@Test
	public void testAddMenu() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid MenuList arraylist to add to", menuList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addMenu(menuList, food1);		
		assertEquals("Test if that MenuList arraylist size is 1?", 1, menuList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Camcorder is added same as 1st item of the list?", food1, menuList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addMenu(menuList, food2);
		C206_CaseStudy.addMenu(menuList, food3);
		assertEquals("Test that Camcorder arraylist size is 3?", 3, menuList.size());
		assertSame("Test that Camcorder is added same as 3rd item of the list?", food3, menuList.get(2));
	}
	@Test
	public void testRetrieveAllMenu() {
		// Test if Item list is not null but empty, so that can add a new ite)
		assertNotNull("Test if there is valid MenuList arraylist to add to", menuList);
		
		//test if the list of Menu retrieved from the CaseStudy is empty
		String allMenu= C206_CaseStudy.retrieveAllMenu(menuList);
		String testOutput = "";
		assertEquals("Check that ViewAllMenuList", testOutput, allMenu);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addMenu(menuList, food1);
		C206_CaseStudy.addMenu(menuList, food2);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, menuList.size());
		
		//test if the expected output string same as the list of camcorder retrieved from the SourceCentre
		allMenu= C206_CaseStudy.retrieveAllMenu(menuList);

		testOutput = String.format("%-10d %-30s %-10d\n",1, "Chicken Rice", 15);
		testOutput += String.format("%-10d %-30s %-10d\n",2, "Hokkien Mee", 7);
	
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allMenu);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}

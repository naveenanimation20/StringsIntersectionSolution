import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IntersectionTest {
	ArrayList<String> AL1 = new ArrayList<String>();
	ArrayList<String> AL2 = new ArrayList<String>();

	@BeforeClass
	public void setUp() {
		// ======
//		AL1.add("test");
//		AL1.add("naveen");
//		AL1.add("appium");
//		AL1.add("appium");
//		AL1.add("test");
//		AL1.add("JIRA");
//		AL1.add(null);
//
//		AL2.add("test");
//		AL2.add("yes");
//		AL2.add("naveen");
//		AL2.add("selenium");
//		AL2.add("appium");
//		AL2.add("JIRA");
//		AL2.add(null);
		
		//generateLargeList method: used to generate large list of strings
		AL1 = generateLargeList(1,50000);
		AL2 = generateLargeList(1,60000);

	}

	@Test
	public void bruteForceIntersectionTest() {
		System.out.println("Intersection with Brute Force Algorithm: -->" + intersectionWithBruteForce(AL1, AL2));

	}

	@Test
	public void IntersectionWithHashImpTest() {
		System.out.println("Intersection with HashSet Data structure implementation: -->"
				+ intersectionWithHashImplementation(AL1, AL2));

	}

	@Test
	public void IntersectionWithHashIteratorTest() {
		System.out.println("Intersection with HashSet Data Structure : -->" + intersectionWithHashSet(AL1, AL2));

	}

	// brute force Traversing
	/*
	 * @author : Naveen Khunteta
	 * 
	 * @functionName: intersectionWithBruteForce
	 * 
	 * @Param: ArrayList a, ArrayList b
	 * 
	 * @description: //ArrayList's contains() is O(n) and is called in a loop
	 * which could be O(n²) for difficult cases traversing by for loop for 1st
	 * ArrayList object ArrayList's contain() method
	 */
	public static ArrayList<String> intersectionWithBruteForce(ArrayList<String> AL1, ArrayList<String> AL2) {
		ArrayList<String> resultArrayList = new ArrayList<String>();
		for (String s : AL1) {
			if (!resultArrayList.contains(s)) {
				if (AL2.contains(s)) // ArrayList's contains() is O(n) and
										// called in a loop which could be O(n²)
										// for lengthy inputs
				{
					resultArrayList.add(s);
				}
			}
		}
		return resultArrayList;
	}

	/*
	 * @author : Naveen Khunteta
	 * 
	 * @functionName: intersectionWithHashImplementation
	 * 
	 * @Param: ArrayList a, ArrayList b
	 * 
	 * @description: use the property of HashSet: access is O(1), which means we
	 * can achieve this in O(n) time traversing by for loop for 2nd ArrayList
	 * object but using HashSet's contains() to achieve fast O(1)
	 */
	public static List<String> intersectionWithHashImplementation(ArrayList<String> a, ArrayList<String> b) {
		Set<String> aHashSet = new HashSet<String>(a);
		List<String> result = new ArrayList<String>();

		for (String s : b) {
			if (aHashSet.contains(s)) {
				result.add(s);
				aHashSet.remove(s);
			}
		}

		return result;
	}

	/*
	 * @author : Naveen Khunteta
	 * 
	 * @functionName: intersectionWithHashSet
	 * 
	 * @Param: ArrayList a, ArrayList b
	 * 
	 * @description: use the property of HashSet: access is O(1), which means we
	 * can achieve this in O(n) time traversing using Iterator : result set in
	 * HashSet object to traverse fast (O(1)) and to avoid duplicates
	 */
	public static List<String> intersectionWithHashSet(ArrayList<String> a, ArrayList<String> b) {
		Set<String> aHashSet = new HashSet<String>(a);
		Set<String> bHashSet = new HashSet<String>(b);
		// use the property of HashSet: access is O(1), which means we can
		// achieve this in O(n) time:
		for (Iterator<String> it = aHashSet.iterator(); it.hasNext();) {
			if (!bHashSet.contains(it.next()))
				it.remove();
		}

		return new ArrayList<String>(aHashSet);
	}

	
	
	/*
	 * generateLargeList method: used to generate large list of strings
	 * 
	 */
	public static ArrayList<String> generateLargeList(int start, int end) {
		// final int N = 1000;
		ArrayList<String> list = new ArrayList<String>();
		String[] stringsArr = new String[end];
		for (int i = start; i <= end; ++i) {
			stringsArr[i-1] = Integer.toString(i);
		}

		System.out.print("ArrayList: ");
		for (String s : stringsArr) {
			list.add(s);
		}
		System.out.println(list);
		System.out.println(list.size());
		return list;
	}

}

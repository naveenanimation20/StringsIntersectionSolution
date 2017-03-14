import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {

		
//		//======
//		ArrayList<String> AL1 = new ArrayList<String>(); // {a, b, c}
//		// Collection<String> col1 = new TreeSet<String>();
//		AL1.add("test");
//		AL1.add("naveen");
//		AL1.add("appium");
//		
//
//		ArrayList<String> AL2 = new ArrayList<String>(); // {b, c, d, e}
//		// Collection<String> col2 = new TreeSet<String>();
//		AL2.add("test");
//		AL2.add("yes");
//		AL2.add("naveen");
//		AL2.add("selenium");
//		AL2.add("appium");
//		
//		System.out.println(intersection(AL1,AL2));
		
		//======
				ArrayList<String> AL1 = new ArrayList<String>();
				AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");
				AL1.add("test");
				AL1.add("JIRA");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");
				AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");
				AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");
				AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");
				AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");
				AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");
				AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");
				AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");
				AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");
				AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");
				AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");AL1.add("test");
				AL1.add("naveen");
				AL1.add("appium");
				AL1.add("appium");

				

				ArrayList<String> AL2 = new ArrayList<String>();
				AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");
				AL2.add("JIRA");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");AL2.add("test");
				AL2.add("yes");
				AL2.add("naveen");
				AL2.add("selenium");
				AL2.add("appium");
				
				System.out.println("Intersection with Brute Force Algorithm: -->"+intersectionWithBruteForce(AL1,AL2));
				System.out.println("Intersection with Brute Force Algorithm: -->"+intersectionWithHash(AL1,AL2));
				System.out.println("Intersection with Brute Force Algorithm: -->"+intersectionWithHashSet(AL1,AL2));

		
	}
	
	

	
	//brute force Traversing 
	public static ArrayList<String> intersectionWithBruteForce( ArrayList<String> AL1, ArrayList<String> AL2){   
	    ArrayList<String> resultArrayList = new ArrayList<String>();
	    for(String s : AL1)
	    {
	        if(!resultArrayList.contains(s))
	        {
	            if(AL2.contains(s))
	            {
	            	resultArrayList.add(s);
	            }
	        }
	    }
	    return resultArrayList;
	}
	
	
	//intersectionWithHash : traversing using Iterator : Here I'm using result set in HashSet object to traverse fast (O(1)) and to avoid duplicates
	public static List<String> intersectionWithHashSet(ArrayList<String> a, ArrayList<String> b) {
	    Set<String> aHashSet = new HashSet<String>(a);
	    Set<String> bHashSet = new HashSet<String>(b);

	    for(Iterator<String> it = aHashSet.iterator(); it.hasNext();) {
	        if(!bHashSet.contains(it.next())) 
	        	it.remove();
	    }

	    return new ArrayList<String>(aHashSet);
	}

	
	
	//intersectionWithHash
	public static List<String> intersectionWithHash(ArrayList<String> a, ArrayList<String> b){
	    Set<String> aHashSet = new HashSet<String>(a);
	    List<String> result = new ArrayList<String>();

	    for (String s: b) {
	        if(a.contains(s)) {
	            result.add(s);
	            aHashSet.remove(s);
	        }
	    }
	    
	    return result;
	}
	

	
//	
//	public static <T> ArrayList<T> intersection(Collection<T> a, Collection<T> b) {
//	    if (b.size() > a.size()) {
//	        return intersection(b, a);
//	    } else {
//	        if (b.size() > 20 && !(a instanceof HashSet)) {
//	            a = new HashSet<T>(a);
//	        }
//	        ArrayList<T> result = new ArrayList<T>();
//	        for (T objb : b) {
//	            if (a.contains(objb)) {
//	                result.add(objb);
//	            }
//	        }
//	        return result;
//	    }
//	}
	

}

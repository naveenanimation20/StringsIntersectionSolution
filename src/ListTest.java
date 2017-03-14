import java.util.ArrayList;
import java.util.List;

public class ListTest {


    public static List<String> generateLargeList(int N) {
       // final int N = 1000;
    	List<String> list = new ArrayList<String>();
    	 String[] strings = new String[N];
         for (int i = 0; i < N; ++i) {
             strings[i] = Integer.toString(i);
         }

         System.out.print("ArrayList: ");
        for (String s : strings) {
            list.add(s);
        }
        System.out.println(list.size());
        System.out.println(list);
        return list;
    }
}
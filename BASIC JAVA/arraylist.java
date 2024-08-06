import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(15);
        list1.add(18);
        list1.add(11);
        list1.add(12);
        list1.add(19);
        System.out.println(list1);
        //removing 
        list1.remove(2);
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.get(2));
        int i;
        for(i=0;i<list1.size();i++)
        {
            System.out.println(list1.get(i));
        }
        //sorting
        Collections.sort(list1);
        System.out.println(list1);
    }
    
}

package ArrayList;
import java.util.ArrayList;
public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Add Element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(5);
        System.out.println(list);

        // Get Element
        System.out.println(list.get(2));

        // Remove Element
        list.remove(4);
        System.out.println(list);

        // Set Operation
        list.set(1, 10);
        System.out.println(list);

        // Contains element
        System.out.println(list.contains(9));
        System.out.println(list.contains(4));
    }
}

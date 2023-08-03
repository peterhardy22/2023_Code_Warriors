import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class ListManipulation {
    public static void main(String[] args) {
        List<Integer> myList1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> myList2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> myList3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> myList4 = new ArrayList<>(Arrays.asList(1, 2, 3));

        System.out.println(listManipulation(myList1, "remove", "end", null));
        System.out.println(listManipulation(myList2, "remove", "beginning", null));
        System.out.println(listManipulation(myList3, "add", "beginning", 20));
        System.out.println(listManipulation(myList4, "add", "end", 30));
    }

    public static Object listManipulation(List<Integer> aList, String command, String location, Integer value) {
        if (command.equals("remove") && location.equals("end")) {
            Integer removedElement = aList.remove(aList.size() - 1);
            return removedElement;
        } else if (command.equals("remove") && location.equals("beginning")) {
            Integer removedElement = aList.remove(0);
            return removedElement;
        } else if (command.equals("add") && location.equals("beginning")) {
            aList.add(0, value);
        } else if (command.equals("add") && location.equals("end")) {
            aList.add(value);
        }
        return aList;
    }
}
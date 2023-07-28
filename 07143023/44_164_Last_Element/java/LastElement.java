public class LastElement {
    public static void main(String[] args) {
        Integer[] testList = {1, 2, 3}; // 3
        String[] emptyTestList = {}; // null
        System.out.println(lastElement(testList));
        System.out.println(lastElement(emptyTestList));
    }
    
    public static <Type> Type lastElement(Type[] inputList) {
        if (inputList == null || inputList.length == 0) {
            return null;
        } else {
            return inputList[inputList.length - 1];
        }
    } 
}

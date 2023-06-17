
public class DivideAndConquer {

    public static void main(String[] args) {
        // Object[] mixerray = { 9, 3, "7", "3" };
        Object[] mixerray = { "5", "0", 9, 3, 2, 1, "9", 6, 7 };
        System.out.println(intStringResulter(mixerray));
    }

    public static int intStringResulter(Object[] mixedArray) {
        int intCounter = 0;
        int stringCounter = 0;

        for (Object element : mixedArray) {
            if (element instanceof Integer) {
                intCounter += (int) element;
            } else if (element instanceof String) {
                String strElement = (String) element;
                stringCounter += Integer.parseInt(strElement);
            }
        }
        
        int answer = intCounter - stringCounter;
        return answer;
    }
}
public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println(calculate(6,"-", 1));
        System.out.println(calculate(6,"m", 1));
        System.out.println(calculate(6,"/", 2));

    }

    public static Object calculate(int a, String o, int b) {
        if (o == "+") {
            return a + b;
        } else if (o == "-") {
            return a - b;
        } else if (o == "/" && b != 0) {
            return a / b;
        } else if  (o =="*") {
            return a * b;
        }
        return "Unable to calculate";
    }
}

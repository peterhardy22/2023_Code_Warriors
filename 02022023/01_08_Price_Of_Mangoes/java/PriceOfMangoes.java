public class PriceOfMangoes {
    public static void main(String[] args) {
        mango(3, 3); // 6
        mango(9, 5); // 30
    }

    public static int mango(int quantity, int price) {
        return (quantity - (quantity / 3)) * price;
    }
}
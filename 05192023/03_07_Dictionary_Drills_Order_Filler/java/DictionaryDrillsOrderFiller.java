import java.util.HashMap;

public class DictionaryDrillsOrderFiller {
    
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("football", 4);
        stock.put("boardgame", 10);
        stock.put("leggos", 1);
        stock.put("doll", 5);

        StockEvaluator(stock, "football", 3); //True
    }

    public static void StockEvaluator(HashMap<String, Integer> stock, String merch, int merchUnits) {
        if (stock.containsKey(merch) && (stock.get(merch) >= merchUnits)) {
            System.out.println("That is in stock, here are your items!");
        } else {
            System.out.println("Unfortunately we do not have that many " + merch + ".");
        }
        
    }

}

import java.util.HashMap;
import java.util.Map;

public class TotalingDonations {
    
    public static void main(String[] args) {
        HashMap<String, Double> peoples = new HashMap<>();
        peoples.put("sam", 25.0);
        peoples.put("lena", 88.99);
        peoples.put("chuck", 13.0);
        peoples.put("linus", 99.5);
        peoples.put("stan", 150.0);
        peoples.put("lisa", 50.25);
        peoples.put("harrison", 10.0);

        Double totalDonations = 0.0;
        for (Map.Entry<String, Double> entry : peoples.entrySet()) {
            totalDonations += entry.getValue();
        }

        System.out.println(totalDonations);
    }

}

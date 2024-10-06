package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr= {{"Java", "10000"},{"Spring","20000"},{"JPA","30000"}};
        Map<String,Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
           String key = product[0];
           String value = product[1];
           productMap.put(key, Integer.valueOf(value));
        }

        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("제품: "+entry.getKey()+", 가격: "+entry.getValue());
        }

    }
}

package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA",90);

        studentMap.put("studentA",100); //같은 키에 저장시 기존 값 교체
        System.out.println(studentMap);

        boolean result = studentMap.containsKey("studentA");
        System.out.println("result = " + result);

        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}

package ra.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("B1",105);
        map.put("B2",100);
        map.put("B3",200);

        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println("key = "+key+"value"+map.get(key));
        }
        System.out.println(map.get("B1"));

    }
}

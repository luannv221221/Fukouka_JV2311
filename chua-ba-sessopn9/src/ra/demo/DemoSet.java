package ra.demo;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> nyc = new HashSet<>();
        nyc.add("Hương");
        nyc.add("Ngọc");
        for (String item : nyc) {
            System.out.println(nyc);
        }
    }
}

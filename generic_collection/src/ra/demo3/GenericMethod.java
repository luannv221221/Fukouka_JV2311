package ra.demo3;

public class GenericMethod {

    public static <T> void  printArrayElement(T[] t){
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }
}

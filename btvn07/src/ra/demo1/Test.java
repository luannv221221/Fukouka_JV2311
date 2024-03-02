package ra.demo1;

public class Test {
    public static void main(String[] args) {
        WebRA ra1 = new WebRA();
        ra1.view();
        System.out.println(WebRA.getCountedView());
        WebRA ra2 = new WebRA();
        ra2.view();
        System.out.println(WebRA.getCountedView());

        NoiPhet noiPhet = new NoiPhet();

    }
}

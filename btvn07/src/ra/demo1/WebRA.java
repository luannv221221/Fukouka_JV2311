package ra.demo1;

public class WebRA {
    private static int countedView = 0;

    public void view(){
        countedView ++;

    }

    public static int getCountedView() {
        return countedView;
    }

}

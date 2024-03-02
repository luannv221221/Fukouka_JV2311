package ra.demo2;

public abstract class Phone {
    private String seriPhone;
    public void showInfo(){
        System.out.println(" Tao là đin thoại đây");
    }

    public Phone() {
    }

    public abstract void nghe();
    public abstract void goi();

}

package ra.demo1;

public class Demo2 {
    private static int num = 1;
    static {
        System.out.println("Chạy trước main");
    }
    static {
        num = 100;
    }


    public Demo2() {
        System.out.println("Phương thức khởi tạo");
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        System.out.println("OK");
    }
    static {
        System.out.println("Trước phương thức khởi tạo");
    }
}

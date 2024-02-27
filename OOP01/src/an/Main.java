package an;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // khởi tạo đối tượng từ lớp an.Dog
        Dog dog1 = new Dog("Vàng","Chó ta",true,"Cậu Vàng");

        Dog dog2 = new Dog("Đen","chó tây",false,"Cho canh sat");
//        dog1.name = "Shiba";
        dog1.color = "Xanh";
        dog1.type = "CHó Tay";
        // truy cập vào thuoojc tinh
//        System.out.println("Chó 1 có tên la "+dog1.name+"Mau"+dog1.color);
//        System.out.println("Chó 2 có tên la "+dog2.name+"Mau"+dog2.color);

        // truy cập vào phương thức
        dog1.sua();
        dog2.sua();
    }
}
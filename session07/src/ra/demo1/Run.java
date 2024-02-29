package ra.demo1;

public class Run {
    public static void main(String[] args) {
        // khởi tạo đối tượng động vật từ lớp Animal

        Cat cat = new Cat();
        cat.batChuot();
        cat.eat();
        Cat cat1 = new Cat("Meo Tom","Dong vat an thit","Xám");
        cat1.eat();
        cat1.batChuot();
        System.out.println(cat1.getName());
    }
}

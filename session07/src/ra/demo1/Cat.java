package ra.demo1;

public class Cat extends Animal {
    private String color;
    public Cat(){
        super();
    }
    public Cat(String name, String type, String color) {
        super(name, type);
        this.color = color;
    }

    public void batChuot(){
        System.out.println("Meo da bat duoc chuot bat chuot");
        super.eat();

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

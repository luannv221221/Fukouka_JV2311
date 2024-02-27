package an;

public class Dog {
    // thuộc tính or trường
    String color;
    protected String type;
    public Boolean sex;
    private String name;
    // phương thức khởi tạo ko tham số
    public Dog(){
    }
    // Phương thức khởi tạo dủ tham số
    public Dog(String color,String type,Boolean sex,String name){
        this.color = color;
        this.type = type;
        this.sex = sex;
        this.name = name;
    }
    // phương thức sủa
    public void sua(){
        System.out.println(name+"Đang sủa");
    }
}


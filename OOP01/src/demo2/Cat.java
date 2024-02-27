package demo2;

public class Cat {
    // trường
    private String catName;
    private int age;
    private String color;

    public Cat() {

    }

    public Cat(String catName, int age, String color) {
        this.catName = catName;
        this.age = age;
        this.color = color;
    }
    // phương tức in thong tin con meo
    public void showInfo(){
        System.out.println("Tooi ten la : "+catName);
        System.out.println("Toi co mau : "+color);
        System.out.println("Nam nay toi : "+age);
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

package demo2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat1 = new Cat();
        String cat1Name = scanner.nextLine();
        cat1.setCatName(cat1Name);
        cat1.showInfo();
        Cat cat2 = new Cat("Tom",100,"Xam");
        cat2.showInfo();
        System.out.println("Cat 2 name la "+cat2.getCatName());
    }
}

package ra.run;

import ra.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        do {
            System.out.println("********************************MENU*************************** \n" +
                    "1.\tNhập thông tin n sinh viên \n" +
                    "2.\tTính điểm trung bình sinh viên \n" +
                    "3.\tXét điểm qua cho sinh viên \n" +
                    "4.\tHiển thị thông tin sinh viên \n" +
                    "5.\tThoát \n");
            System.out.println("Moi ban chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Mày muốn nhập bào nhiêu thằng ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();
                        student.inputData();
                        list.add(student);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên ");
                    for (Student student : list) {
                        student.displayData();
                    }
                    break;
            }
        } while (true);

    }
}

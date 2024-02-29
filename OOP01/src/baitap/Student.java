package baitap;

import java.util.Scanner;

public class Student {
    private String studentCode;
    private String studentName;
    private boolean sex;

    public Student() {
    }

    public Student(String studentCode, String studentName, boolean sex) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.sex = sex;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void showInfo(){
        System.out.printf("Ho Và Tên : %s",studentName);
        System.out.printf("\tMa SV : %s",studentCode);
        System.out.printf("\tGioi Tinh : %s",(sex ? "Name" : "Nư"));
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma sinh vien ");
        studentCode = scanner.nextLine();
        System.out.println("Nhap vao ten sinh vien ");
        studentName = scanner.nextLine();
        System.out.println("Nhap vao gioi tinh ");
        sex = scanner.nextBoolean();
    }
}

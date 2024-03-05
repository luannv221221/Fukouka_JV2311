package ra.entity;

import ra.itf.IStudent;

import java.util.Scanner;

public class Student implements IStudent {
    private String studentCode;
    private String studentName;

    public Student() {
    }

    public Student(String studentCode, String studentName) {
        this.studentCode = studentCode;
        this.studentName = studentName;
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

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên");
        studentCode = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên");
        studentName = scanner.nextLine();
    }

    @Override
    public void displayData() {
        System.out.println("Mã SV : "+studentCode);
        System.out.println("Họ và tên : "+studentName);
    }
}

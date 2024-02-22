import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int [row][col];

        System.out.println("Nhap vao cac gia trị pần tu mang ");
        for (int i = 0; i < matrix.length; i++) {
            for (int m = 0; m < matrix[i].length; m++) {
                System.out.printf("arr[%d][%d]=",i,m);
                matrix[i][m] = sc.nextInt();
            }
        }
    }
}

import java.util.Scanner;

public class Bt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so hang");
        int row = scanner.nextInt();
        System.out.println("Nhap vao so cot");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        do {
            System.out.println("==============MENU==============");
            System.out.println("1. Nhập vào giá trị các phần tử mảng");
            System.out.println("2. In ra các phần tử mảng");
            System.out.println("3. Hiển thị dưới dạng ma trận");
            System.out.println("4. In ra đường chéo chính");
            System.out.println("5. In ra Đường chéo phụ");
            System.out.println("6. In ra đường biên");
            System.out.println("7. Thoát chường trình");
            System.out.println("Moi ban nhap tu 1 - 7 nh");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Vui long nhap gia tri cho phan tu mang");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("arr[%d][%d] = ", i, j);
                            matrix[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("%d\t", matrix[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if(i==j){
                                System.out.printf("%d\t", matrix[i][j]);
                            }
                            System.out.printf("%s\t","");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if(i+j == matrix.length - 1){
                                System.out.printf("%d\t", matrix[i][j]);
                            }
                            System.out.printf("%s\t","");
                        }
                        System.out.println();
                    }
                    break;
            }

        } while (true);
    }
}

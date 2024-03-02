package ra.bt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PersonAccount personAccount = new PersonAccount("9999999", "Thao Cute", 500);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("===========MENU============");
            System.out.println("1. Kiểm tra tài khoản ");
            System.out.println("2. Nạp tiền ");
            System.out.println("3. Rút tiền ");
            System.out.println("4. Thoaát");
            System.out.println("Moi ban chon 1 - 4");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println(personAccount.toString());
                    break;
                case 2:
                    personAccount.deposit();
                    break;
                case 3:
                    personAccount.withDraw();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (true);
    }
}

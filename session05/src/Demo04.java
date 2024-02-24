import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap vao so");
            String num = scanner.nextLine();
            // 09|03|07
            // Pattern phoneRegex = Pattern.compile("(84|0[3|5|7|8|9])+([0-9]{8})");
            // nguyen@gmail.com
            Pattern emailRegex = Pattern.compile("([a-z A-Z]+)@([a-z]{3,30})\\.([a-z]{1,4})");
            Matcher check = emailRegex.matcher(num);
            if(check.matches()){
                break;
            } else {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
        System.out.println("Cam on ban ");
    }
}

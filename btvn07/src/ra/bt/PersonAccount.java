package ra.bt;

import java.util.Scanner;

public class PersonAccount extends Account {
    private float fee;

    public PersonAccount() {
    }

    public PersonAccount(String accountNo, String customerName, double balance) {
        super(accountNo, customerName, balance);

    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public void withDraw(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số tiền cần rút ");
            int moneyWithDraw = Integer.parseInt(scanner.nextLine());
            if (moneyWithDraw<10){
                fee = (float) (moneyWithDraw * 0.1);
            } else {
                fee = (float) (moneyWithDraw * 0.3);
            }
            double totalMoney = moneyWithDraw + fee;
            if(totalMoney > getBalance()){
                System.err.println("Vượt quá số dư vui long thư lại");
            } else {
                setBalance(getBalance() - totalMoney);
                return;
            }
        } while (true);

    }
    public void deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tien muon gui");
        int moneyDeposit = Integer.parseInt(scanner.nextLine());
        setBalance(getBalance() + moneyDeposit);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

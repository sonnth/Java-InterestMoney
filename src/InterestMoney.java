import java.util.Scanner;

public class InterestMoney {
    public static void main(String[] args) {
        double money = 1.0, interest_rate = 1.0;
        int month = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interest_rate = scanner.nextDouble();
        double total_interst = 0;
        for (int i = 0; i < month; i++) {
            total_interst = money * (interest_rate / 100 / 12) * 3;
        }
        System.out.println("Total of interest: " + total_interst);
    }
}

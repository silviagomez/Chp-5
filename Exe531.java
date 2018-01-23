import java.util.Scanner;
public class Exe531 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("5.31 -Annual percentage CD Value Calculation");
        System.out.print("Enter an amount: ");
        double amount  = scan.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double percent = scan.nextDouble();
        System.out.print("Enter number of months: ");
        int months = scan.nextInt();
        System.out.printf("%-10s%-10s\n", "Month",
                "CD Value");
        calculatePrnt(amount,percent,months);
    }

    public static void calculatePrnt(double am, double pe, int mn){
        double fResult = am + am * pe / 1200;
            if (mn >1){
                for(int i = 0; i<mn; i++){
                    System.out.printf("%-10d%-10.2f\n", i+1, fResult);
                    fResult = fResult + fResult * pe / 1200;
                               }
            }
            else {
                System.out.printf("%-10d%-10f\n", mn, fResult);
            }
        }
    }


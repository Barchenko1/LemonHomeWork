import java.util.Scanner;
public class Thirteenth2 {
    public static void main(String[] args) {
        System.out.print("Input number of days: ");
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        System.out.println("In " + days + " days: " + days * 24 + " hours, " + days * 1440 + " minutes, " + days * 86400 + " seconds.");
    }
}
import java.util.Scanner;
public class Ninth{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("¬ведите число которое вы хотите проверить");
        double d=scan.nextDouble();
        System.out.println("¬аше число: "+d+(d%1==0 ? " - целое " : " - не целое"));
    }
}
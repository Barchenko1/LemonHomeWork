import java.util.Scanner;
public class Twelfth {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("¬ведите рассто€ние до города N (км): ");
        double distance=scan.nextInt();
        System.out.println("¬ведите врем€ за которое нужно доехать до города N (ч): ");
        double time=scan.nextInt();
        double speed=distance/time;
        System.out.println("¬аша скорость: "+speed+" км/ч ");
    }
}
import java.util.Scanner;
public class Twelfth {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("������� ���������� �� ������ N (��): ");
        double distance=scan.nextInt();
        System.out.println("������� ����� �� ������� ����� ������� �� ������ N (�): ");
        double time=scan.nextInt();
        double speed=distance/time;
        System.out.println("���� ��������: "+speed+" ��/� ");
    }
}
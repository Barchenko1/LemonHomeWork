import java.util.Scanner;
public class Sixteenth{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("������� ����������� � �������� �������: ");
        double numberCel=scan.nextInt();
        double numberFar=numberCel*9/5+32;
        System.out.println("�����������  � �������� ����������: "+numberFar);
    }
}
import java.util.Scanner;
public class Ninth{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("������� ����� ������� �� ������ ���������");
        double d=scan.nextDouble();
        System.out.println("���� �����: "+d+(d%1==0 ? " - ����� " : " - �� �����"));
    }
}
import java.util.Scanner;
public class Fifteenth{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("������ ����� ������ 1: ");
        double number1=scan.nextDouble();
        System.out.println("������ ����� ������ 2: ");
        double number2=scan.nextDouble();
        double L=Math.sqrt(Math.pow(number1,2)+Math.pow(number2,2));
        double P=L+number1+number2;
        double S=0.5*number1*number2;
        System.out.println("L ����������: "+L+" P ������������: "+P+" S ������������: "+S);
    }
}
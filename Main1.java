import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Point a=new Point();
        System.out.println("������� ���������� ������ ����� �� ���������: ");
        a.inputPoint();
        Point b= new Point(0,0);
        System.out.println("������� ���������� ������ ����� �� ���������: ");
        b.inputPoint();
        if (a.isSame(b)){
            System.out.println("����� ���������!");
        } else {
            System.out.println("���������� ����� �������: "+b.getDistance(a));
        }
        if (a.getRadius()<b.getRadius()){
            System.out.println("� ������ ��������� ����� ������ �����! "+a.getRadius());
        } else if(a.getRadius() == b.getRadius()) {
            System.out.println("����� ������������ �� ������ ���������! "+a.getRadius());
        } else {
            System.out.println("� ������ ��������� ����� ������ �����! "+b.getRadius());
        }

    }

   static class Point{
        double x;
        double y;

        void printPoint(){
            System.out.print("("+x+";"+y+")");
        }
        void setPoint(double a, double b){
            x=a;
            y=b;
        }
        void inputPoint(){
            Scanner inp=new Scanner(System.in);
            System.out.print("������� ��������: ");
            double a=inp.nextDouble();
            System.out.print("������� ��������: ");
            double b=inp.nextDouble();
            setPoint(a,b);
        }
        boolean isSame(Point a){
            if (x==a.x&&y==a.y){
                return true;
            } else {
                return false;
            }
        }
        double getDistance(Point a){
            return Math.sqrt(Math.pow(x-a.x, 2) + Math.pow(y-a.y, 2) );
        }
        double getRadius(){
            Point a=new Point(0,0);
            return this.getDistance(a);
        }
        Point(){
            x=0;
            y=0;
        }
        Point(double x, double y){
            this.x=x;
            this.y=y;
        }
    }
}

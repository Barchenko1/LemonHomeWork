public class Degrees {
    public static void main(String[] args) {
        double num1 = Double.parseDouble( args[0] ) ;
        double c=Math.toRadians(num1);
        double a=Math.sin(c);
        double b=Math.cos(c);
        System.out.println("� �������� : "+num1+"="+c);
        System.out.println("����� : "+num1+"="+a);
        System.out.println("������� : "+num1+"="+b);
    }
}

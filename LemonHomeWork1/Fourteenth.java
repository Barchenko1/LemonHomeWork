import java.util.Scanner;
public class Fourteenth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input grn course: ");
        double grnCourse = scanner.nextDouble();
        System.out.print("Input grn count: ");
        double grnCount = scanner.nextDouble();
        System.out.println("You can buy "+ convert(grnCourse,grnCount)+" dollars.");
    }
    static double convert(double grnCourse, double grnCount){
        return grnCount/grnCourse;
    }
}
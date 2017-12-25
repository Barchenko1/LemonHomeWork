public class Third{
    public static void main (String[] args) {
        double a = 12.8;
        double n = a - (int) a;
        System.out.print (a + " округляем и получаться - " );
        if (n >= 0.5) {

            a += 1;

        } else a = (int) a;
        System.out.println ( (int)a);
    }
}
public class Multiplication {
    public static void main(String[] args) {
        System.out.println(Multi(7));
    }
    public static int Multi(int a) {
        int c = 0;
        for (int b = 1; b <= 3; b++) {
            c = c + a;
        }
        return c;
    }
}


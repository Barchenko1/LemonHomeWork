public class SymbolTest {
    public static void main(String[] args) {
        int num1 = Integer.parseInt( args[0] ) ;
        for ( int i = 0; i < num1; i++ ) {
            char c = (char)(Math.random()*26 + 'a');
            System.out.print(c + ": ");
            switch ( c ) {
                case 'a': case 'e': case 'i':
                case 'o': case 'u':
                    System.out.println("�������");
                    break;
                case 'y': case 'w':
                    System.out.println("������ �������");
                    break;
                default:
                    System.out.println("���������");
            }
        }
    }

}
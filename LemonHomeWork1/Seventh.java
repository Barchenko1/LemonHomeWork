public class Seventh{
    public static void main(String[] args){
        int num1 = Integer.parseInt( args[0] ) ;
        int num2 = Integer.parseInt( args[1] ) ;
        if (num1<num2){
            System.out.println(num1+" меньше чем "+num2);
        }
        else{ if (num1>num2){
            System.out.println(num1+" больше чем "+num2);
        }}
    }
}
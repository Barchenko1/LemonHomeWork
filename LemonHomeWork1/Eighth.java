public class Eighth {
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        if((num1%2)==0){
            System.out.println("����� " + num1 + " ������ ");
        }
        else{
            if((num1%1)==0){
                System.out.println("����� " + num1 + " �������� ");
            }
        }
    }
}
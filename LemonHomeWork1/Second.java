public class Second{
    public static void main(String[] args){
        int num=23;
        int sum=0;
        int currentDigit;
        currentDigit=num%10;
        sum=sum+currentDigit;
        num=num/10;
        sum=sum+num;
        System.out.println("сумма цифр числа 23 равна "+sum);
    }
}
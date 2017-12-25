public class Fourth{
    public static void main(String[] args){
        int num=745;
        int sum=0;
        int currentDigit;
        currentDigit=num%10;
        sum=sum+currentDigit;
        num=num/10;
        currentDigit=num%10;
        sum=sum+currentDigit;
        num=num/10;
        sum=sum+num;
        System.out.println("сумма цифр числа 745 равна "+sum);

    }
}
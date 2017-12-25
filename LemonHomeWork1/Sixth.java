public class Sixth{
    public static void main(String[] args){
        double[] numberArray={100,200,300,400,500};
        System.out.println("Массив: "+numberArray[0]+","+numberArray[1]+","+numberArray[2]+","+numberArray[3]+","+numberArray[4]);
        double k=0.1;
        numberArray[2]=numberArray[2]+numberArray[2]*k;
        System.out.println("Массив измененный: "+numberArray[0]+" , "+numberArray[1]+" , "+numberArray[2]+" , "+numberArray[3]+" , "+numberArray[4]);
    }
}
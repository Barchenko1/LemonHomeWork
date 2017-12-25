import java.io.*;
public class Tenth{
    public static void main(String[] args){
        System.out.println("Как вас зовут: ");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader buffer=new BufferedReader(isr);
        String input="";
        try{
            input=buffer.readLine();
            buffer.close();
        }
        catch (IOException e)
        {
            System.out.println( "Произошла ошибка ввода") ;
        }
        System.out.println( "\nСпасибо, вас зовут: " + input ) ;
    }
}
import java.util.Arrays;
public class ByteArray {
    public static void main(String[] args) {
       String str="www.journaldev.com";
       byte[] byteArr=str.getBytes();
       System.out.println("String to byte array : "+Arrays.toString(byteArr));
       String str1=new String(byteArr);
       System.out.println("byte array to String : "+str1);
       System.out.println("str == str1? " + (str == str1));
       System.out.println("str.equals(str1)? " + (str.equals(str1)));
    }

}

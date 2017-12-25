public class Palindrome {
    public static void main(String[] args) {
        System.out.print(isPalindrome(""));
    }
    public static boolean isPalindrome(String str){
        if (str==null)
            return false;
        StringBuilder strBuilder=new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }
}

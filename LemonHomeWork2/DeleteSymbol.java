public class DeleteSymbol {
    public static void main(String[] args) {
        System.out.println(removeChar("Мама мыла машину", 'м'));
    }

    private static String removeChar(String str, char ch) {
        if (str == null) {
            return null;}
            return str.replaceAll(Character.toString(ch), "");
        }
}

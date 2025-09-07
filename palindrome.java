public class SimplePalindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();

        System.out.println(str + (str.equals(rev) ? " is a palindrome." : " is not a palindrome."));
    }
}

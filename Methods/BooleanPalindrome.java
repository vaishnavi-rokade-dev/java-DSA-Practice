public class BooleanPalindrome{
public static boolean Palindrome(String word){
boolean ans = false;
String reverse = "";
for(int i = word.length()-1;i>=0;i--){
char ch = word.charAt(i);
reverse = reverse + word.charAt(i);
}
 return word.equals(reverse);
}
public static void main(String[] args){
boolean result = Palindrome("madam");
System.out.println(result);
}
}
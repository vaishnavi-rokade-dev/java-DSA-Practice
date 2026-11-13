public class MethodCallingMethod{

public static String reverseWord(String word){
String reverse = "";
for(int i = word.length()-1;i>=0;i--){
reverse = reverse + word.charAt(i);
}
return reverse;
}

public static boolean IsPalindrome(String word){

    String reverse = reverseWord(word);

    return word.equals(reverse);
}
public static void main(String[] args){

boolean result = IsPalindrome("madam");
System.out.println(result);
}


}
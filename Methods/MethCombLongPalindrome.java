public class MethCombLongPalindrome{

public static boolean LongWord(String word){

return word.length()>5;
}
public static boolean IsPalindrome(String word){
String reverse = "";

for(int i = word.length()-1;i>=0;i--){

reverse = reverse + word.charAt(i);
}
return word.equals(reverse);
}
public static boolean LongandPalindrome(String word){

return LongWord(word) && IsPalindrome(word);

}
public static void main(String[] args){

boolean result = LongandPalindrome("racecar");
System.out.println(result);
}
}
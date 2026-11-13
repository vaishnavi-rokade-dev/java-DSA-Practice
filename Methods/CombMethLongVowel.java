public class CombMethLongVowel{

public static boolean IsLongWord(String word){

return word.length()>5;
}
public static boolean StartsWithVowel(String word){
word = word.toLowerCase();
char ch = word.charAt(0);

return ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u';

}
public static boolean LongWordStartsWithVowel(String word){

return IsLongWord(word) && StartsWithVowel(word);
}
public static void main(String[] args){
boolean result = LongWordStartsWithVowel("java");
System.out.println(result);
}
}
//Using one method in another method and using those methods finding answer
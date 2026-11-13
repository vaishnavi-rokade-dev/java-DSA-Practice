public class CombiningMethodVowelStartEnd{

public static boolean StartVowel(String word){

    word = word.toLowerCase();

    char ch = word.charAt(0);

    return ch == 'a' || ch == 'e' ||
           ch == 'i' || ch == 'o' ||
           ch == 'u';
}
public static boolean EndWiVowel(String word){
word = word.toLowerCase();
char ch = word.charAt(word.length()-1);


return ch == 'a'||ch == 'e'||
ch == 'i'||
ch == 'o'||
ch == 'u';

}
public static boolean StartsAndEndsWithVowel(String word){

return StartVowel(word) && EndWiVowel(word);

}
public static void main(String[] args){
boolean result = StartsAndEndsWithVowel("Apple");
System.out.println(result);
}

}
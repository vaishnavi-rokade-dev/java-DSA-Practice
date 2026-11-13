public class LongStartEndWithVowel{

public static boolean Longword(String word){

return word.length()>5;

}
public static boolean StartWithVowel(String word){
word = word.toLowerCase();
char ch = word.charAt(0);

return ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u';
}
public static boolean EndWithVowel(String word){
word = word.toLowerCase();
char ch = word.charAt(word.length()-1);
return ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u';
}

public static boolean StartEndVowelLong(String word){
return Longword(word) && StartWithVowel(word) && EndWithVowel(word);
}
public static void main(String[] args){

boolean result = StartEndVowelLong("Orange");
System.out.println(result);
}



}
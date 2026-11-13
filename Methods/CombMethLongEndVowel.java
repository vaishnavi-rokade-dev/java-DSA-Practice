public class CombMethLongEndVowel{

public static boolean IsLongWord(String word){

return word.length()>5;
}
public static boolean EndWithVowel(String word){
char ch = word.charAt(word.length()-1);

return ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u';
}

public static boolean LongEndWithVowel(String word){

return  IsLongWord(word) && EndWithVowel(word);
}

public static void main(String[] args){
boolean ans = LongEndWithVowel("Orange");
System.out.println(ans);
}
}
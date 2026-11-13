public class EndWithVowel{

public static boolean EndWiVowel(String word){
word = word.toLowerCase();
char ch = word.charAt(word.length()-1);


return ch == 'a'||ch == 'e'||
ch == 'i'||
ch == 'o'||
ch == 'u';

}

public static void main(String[] args){

boolean result = EndWiVowel("Orange");
System.out.println(result);

}
}
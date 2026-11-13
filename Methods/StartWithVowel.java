public class StartWithVowel{

public static boolean StartVowel(String word){

    word = word.toLowerCase();

    char ch = word.charAt(0);

    return ch == 'a' || ch == 'e' ||
           ch == 'i' || ch == 'o' ||
           ch == 'u';
}
public static void main(String[] args){
boolean result = StartVowel("pple");
System.out.println(result);

}
}
public class FirstCharInWord{

public static String FirstCharacterInWord(String word){

return String.valueOf(word.charAt(0));
}
public static void main(String[] args){

String character = FirstCharacterInWord("Programming");
System.out.println(character);
}

}
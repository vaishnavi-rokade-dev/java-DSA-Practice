public class LastCharInWord{

public static String LastChInWord(String word){

return String.valueOf(word.charAt(word.length()-1));

} 
public static void main(String[] args){
String result = LastChInWord("Programming");
System.out.println(result);
}
}
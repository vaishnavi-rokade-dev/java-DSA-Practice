public class ReverseStrinMethod{

public static String reverseWord(String word){
String reverse = "";
for(int i = word.length()-1;i>=0;i--){
reverse = reverse + word.charAt(i);
}
return reverse;
}
public static void main(String[] args){
String result = reverseWord("Programming");
System.out.println(result);
}}
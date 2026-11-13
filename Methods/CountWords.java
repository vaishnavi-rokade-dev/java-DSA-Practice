public class CountWords{

public static int CountWordInSennt(String sentence){

String[] words = sentence.split(" ");
return words.length;
}
public static void main(String[] args){
int result = CountWordInSennt("Java is easy");
System.out.println(result);
}


}
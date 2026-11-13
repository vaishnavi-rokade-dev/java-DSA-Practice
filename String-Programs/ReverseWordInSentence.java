public class ReverseWordInSentence{
public static void main(String[] args){

String str = "Java is very easy";
String[] words = str.split(" ");
for(int i =words.length-1;i>=0;i--){
System.out.print(words[i] + " ");

}
}
}
//It reverse the order of words 
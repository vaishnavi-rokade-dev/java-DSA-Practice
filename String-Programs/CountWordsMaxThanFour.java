public class CountWordsMaxThanFour{
public static void main(String[] args){

String str = "Java is a powerful programming language";
String[] words = str.split(" ");
int count = 0;

for(int i =0;i<words.length;i++){
if(words[i].length()>4){
count++;

}
}
System.out.println(count);
}


}
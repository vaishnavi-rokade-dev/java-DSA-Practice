public class CountWordsWithOddLength{
public static void main(String[] args){

String str = "Java is a powerful programming language";
String[] words = str.split(" ");
int Count = 0;

for(int i =0;i<words.length;i++){

if(words[i].length() % 2 != 0){
Count++;
}

}
System.out.println(Count);
}
}
public class CountLongWords{

public static int LongWord(String sentence){
int count = 0;
String[] words = sentence.split(" ");

for(int i =0;i<words.length;i++){

if(words[i].length() > 5){
count++;
}

}return count;
}
public static void main(String[] args){

int result = LongWord("Java programming is very easy");
System.out.println(result);
}
}
public class CountWordExactLengthStartVowel{
public static void main(String[] args){

String str ="Apple orange is about elephant";
str = str.toLowerCase();
String[] words = str.split(" ");
int Count = 0;

for(int i =0;i<words.length;i++){

char ch = words[i].charAt(0);
if((words[i].length() == 5) && (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') ){
Count++;
}

}
System.out.println(Count);
}
}
public class CountWordEndWithConsonant{
public static void main(String[] args){

String str = "Java is an orange apple";
String[] words = str.split(" ");
int WordCount =0;
for(int i = 0; i < words.length; i++){
char ch = words[i].charAt(words[i].length()-1);
if(ch != 'a'&& ch != 'e'&& ch != 'i' && ch != 'o' && ch != 'u'){
WordCount++;
}

}
System.out.println(WordCount);

}

}
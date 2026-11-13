public class WordCountOccurence{
public static void main(String[] agrs){

String str = "Java Is good java is powerfool thing java";
String target = "Java";
String[] words = str.split(" ");
int count =0;
for(int i =0;i<words.length;i++){
if(words[i].equalsIgnoreCase(target)){
count++;
}

}
System.out.println(count);
}

}
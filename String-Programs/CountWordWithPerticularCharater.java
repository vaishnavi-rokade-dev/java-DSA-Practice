public class CountWordWithPerticularCharater{
public static void main(String[] args){

String str = "Java is a Programming Language";
char target = 'a';
String[] words = str.split(" ");

int count = 0;
for(int i =0;i<words.length;i++){
words[i].indexOf(target);
if(words[i].indexOf(target) != -1){
count++;
}

}
System.out.println(count);
}}
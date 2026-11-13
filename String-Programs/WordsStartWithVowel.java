public class WordsStartWithVowel{
public static void main(String[] args){

String str = "Apple is an orange elephant";
String[] words = str.split(" ");
int count =0;
for(int i = 0 ;i<words.length;i++){
if(words[i].charAt(0)=='A'||words[i].charAt(0)=='E'||words[i].charAt(0)=='I'||words[i].charAt(0)=='O'||words[i].charAt(0)=='U'||words[i].charAt(0)=='a'||words[i].charAt(0)=='e'||words[i].charAt(0)=='i'||words[i].charAt(0)=='o'||words[i].charAt(0)=='u'){
count++;

}


}
System.out.println(count);
}}
public class PalindromeWordsInString{
public static void main(String[] args){

String str = "madam Java level racecar code";
String[] words = str.split(" ");
int count = 0;
for(int i =0;i<words.length;i++){

String reverse = "";
for(int j =words[i].length()-1;j>=0;j--){
reverse = reverse + words[i].charAt(j);
}
if(words[i].equals(reverse)){
count++;
}
}

System.out.println(count);
}}
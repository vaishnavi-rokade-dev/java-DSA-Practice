public class WordHaveMinimumConsonant{
public static void main(String[] args){

String str = "Java sky programming elephant";
String[] words = str.split(" ");
String minWord = "";
int minCount = 100;
for(int i =0;i<words.length;i++){
int ConsonantCount = 0;
for(int j =0;j<words[i].length();j++){
char ch = words[i].charAt(j);
if(ch != 'a'&&ch != 'e'&& ch != 'i'&& ch != 'o'&& ch != 'u'){
ConsonantCount++;
}
}
if(ConsonantCount<minCount){
minCount = ConsonantCount;
minWord = words[i];
}
}

System.out.println(minWord);
}}
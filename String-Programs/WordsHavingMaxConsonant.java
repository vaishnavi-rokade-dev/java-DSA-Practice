public class WordsHavingMaxConsonant{
public static void main(String[] args){

String str = "Java sky programming elephant";
String[] words = str.split(" ");
int count = 0;
int maxConsonant = 0;
String maxWord = "";

for(int i =0;i<words.length;i++){
int consonantCount = 0;
for(int j =0;j<words[i].length();j++){
char ch = words[i].charAt(j);
if(ch != 'a' &&
   ch != 'e' &&
   ch != 'i' &&
   ch != 'o' &&
   ch != 'u'){
consonantCount++;

}

}
if(consonantCount > maxConsonant){
    maxConsonant = consonantCount;
    maxWord = words[i];
}
}
System.out.println(maxWord);
}}
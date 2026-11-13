public class WordWithMaxVowels{
public static void  main(String[] args){

String str ="Java is an orange elephant";
String[] words = str.split(" ");
int maxVowel = 0;
String maxWord = " ";

for(int i =0;i<words.length;i++){
int vowelCount = 0;
for(int j =0;j<words[i].length();j++){
char ch = words[i].charAt(j);
if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
vowelCount++;
}

}
if(vowelCount>maxVowel){
maxVowel = vowelCount;
maxWord = words[i];

}
}
System.out.println(maxWord);
}
}

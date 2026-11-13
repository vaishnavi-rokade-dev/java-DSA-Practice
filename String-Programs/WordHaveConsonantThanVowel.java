public class WordHaveConsonantThanVowel{
public static void main(String[] args){

String str = "Java sky programming elephant";
String[] words = str.split(" ");

int wordcount = 0;
for(int i =0;i<words.length;i++){
int vowelcount = 0;
int consonantcount = 0;
for(int j =0;j<words[i].length();j++){

char ch = words[i].charAt(j);

if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
vowelcount++;
}
if(ch != 'a'&& ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
consonantcount++;
}
}
if(consonantcount>vowelcount){
wordcount++;
}

}
System.out.println(wordcount);

}
}
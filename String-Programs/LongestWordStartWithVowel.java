public class LongestWordStartWithVowel{
public static void main(String[] args){

String str = "Apple orange is elephant umbrella";
str = str.toLowerCase();
String[] words = str.split(" ");
String maxword = words[0];
for(int i = 0;i<words.length;i++){

char ch = words[i].charAt(0);
if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
if(words[i].length()>maxword.length()){
maxword = words[i];
}
}
}


System.out.println(maxword);
}



}
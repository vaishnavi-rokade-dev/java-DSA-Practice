public class WordLengthVowel{
public static void main(String[] args){

String str = "Apple is an orange elephant";
str = str.toLowerCase();
String[] words = str.split(" ");
int count = 0;

for(int i =0;i<words.length;i++){
char ch = words[i].charAt(0);
if(words[i].length()>3 && (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
count++;
}

}
System.out.println(count);
}

}
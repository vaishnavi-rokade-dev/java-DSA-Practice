public class CountPalindromeWords{

public static int CountPalindromeWords(String sentence){

String[] words = sentence.split(" ");
int count = 0;
for(int i =0;i<words.length;i++){
String rev = "";
for(int j = words[i].length()-1;j>=0;j--){
rev = rev + words[i].charAt(j);
}
if(words[i].equals(rev)){
count++;
}
}
return count;
}

public static void main(String[] args){
int reverse = CountPalindromeWords("madam java level racecar code");
System.out.println(reverse);
}


}
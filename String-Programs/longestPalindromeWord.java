public class longestPalindromeWord{
public static void main(String[] args){

String str = "madam Java level racecar code";
String[] words = str.split(" ");
String longest = "";

for(int i =0;i<words.length;i++){
String reverse = "";

for(int j = words[i].length()-1;j>=0;j--){
reverse = reverse + words[i].charAt(j);
}
if(words[i].equals(reverse)){
if(words[i].length() > longest.length()){
longest = words[i];
}
}
}
System.out.println(longest);

}}
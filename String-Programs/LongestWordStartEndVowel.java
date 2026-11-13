public class LongestWordStartEndVowel{
public static void main(String[] args){

String str = "Apple orange is elephant umbrella";
String[] words = str.split(" ");
String longest = " ";
for(int i = 0;i< words.length;i++){


char first = words[i].charAt(0);
char last = words[i].charAt(words[i].length()-1);

if((first=='a'||first=='e'||first=='i'||first=='o'||first=='u')
   &&
   (last=='a'||last=='e'||last=='i'||last=='o'||last=='u')){
if(words[i].length()>longest.length()){
longest = words[i];

}
}
}
System.out.println(longest);
}}
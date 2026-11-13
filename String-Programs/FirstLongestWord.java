public class FirstLongestWord{
public static void main(String[] args){

String str = "Java is very powerful programming language";
String[] words = str.split(" ");
String Longest = words[0];

for(int i=0;i< words.length;i++){

if(words[i].length() > Longest.length()){
Longest = words[i];

}

}
System.out.println(Longest);
}
}
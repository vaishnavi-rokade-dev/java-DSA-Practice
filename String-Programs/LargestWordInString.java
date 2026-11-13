public class LargestWordInString{
public static void main(String[] args){

String str = "Java is a Programming language";
String[] words = str.split(" ");
String longest = words[0];

for(int i=0;i<words.length;i++){

if(words[i].length()>longest.length()){
longest = words[i];
}

}

System.out.println(longest);
}
}
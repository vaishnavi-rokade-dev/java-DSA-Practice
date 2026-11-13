public class SecondLongestWordInString{
public static void main(String[] args){

String str ="Java is very powerful programming language";
String[] words = str.split(" ");

String longest = "";
String secondLongest = "";

for(int i =0;i<words.length;i++){

if(words[i].length() > longest.length()){
secondLongest = longest;
longest = words[i];
}else if(words[i].length() > secondLongest.length()
        && words[i].length() < longest.length())
{
    secondLongest = words[i];
}

}
System.out.println(secondLongest);
}
}
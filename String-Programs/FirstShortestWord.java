public class FirstShortestWord{
public static void main(String[] args){

String str = "Java is an a language";
String[] words = str.split(" ");
String shortest = words[0];

for(int i =0;i<words.length;i++){

if(words[i].length()<shortest.length()){
shortest = words[i];

}

}
System.out.println(shortest);


}}
public class SecondShortetWordInString{
public static void main(String[] args){

String str = "Java is very powerful programming language";
String[] words = str.split(" ");

String shortest = words[0];
String SecondShortest = "";
for(int i =0;i<words.length;i++){

if(words[i].length()<shortest.length()){
SecondShortest = shortest;
shortest = words[i];
}
}

System.out.println(SecondShortest);
}
}
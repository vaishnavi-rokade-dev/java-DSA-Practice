public class CountWordWithExactLength{
public static void  main(String[] args){

String str = "Java is very good programming";
String[] words = str.split(" ");
int Count = 0;
for(int i=0;i<words.length;i++){

if(words[i].length()==4){
Count++;
}

}
System.out.println(Count);
}}
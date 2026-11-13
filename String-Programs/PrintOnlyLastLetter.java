public class PrintOnlyLastLetter{
public static void main(String[] args){

String str = "Java is a Programming Language";
String[] word = str.split(" ");

for(int i =0;i<word.length;i++){
System.out.print(word[i].charAt(word[i].length()-1));

}

}


}
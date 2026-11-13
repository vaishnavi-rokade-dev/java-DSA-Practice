public class PrintOnlyStartingLetter{
public static void main(String[] args){

String str = "Java is a Programming Language";
String[] word = str.split(" ");

for(int i =0;i<word.length;i++){

System.out.print(word[i].charAt(0));

}

}

}
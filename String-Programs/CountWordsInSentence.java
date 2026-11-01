public class CountWordsInSentence{
public static void main(String[] args){

String str = "I am Vaishnavi";
int count = 1;
for(int i =0;i<str.length();i++){
if(str.charAt(i) == ' '){
count++;
}

} 

System.out.print(count);
}
}
//count words in the perticular sentence
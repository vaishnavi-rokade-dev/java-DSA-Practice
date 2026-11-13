public class FirstLastCharSameInWord{
public static void main(String[] args){

String str = "aba Java level radar code";
String[] words = str.split(" ");
int count = 0;

for(int i =0;i<words.length;i++){

char first = words[i].charAt(0);
char last = words[i].charAt(words[i].length()-1);

if(first == last){
count++;
}

}
System.out.println(count);
}


}
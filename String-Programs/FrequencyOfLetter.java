public class FrequencyOfLetter{
public static void main(String[] args){

String str = "programming";
int count = 0;
char target = 'g';
for(int i=0;i<str.length();i++){
char ch = str.charAt(i);

if(target==str.charAt(i)){

count++;}


}
System.out.println(count);

}




}
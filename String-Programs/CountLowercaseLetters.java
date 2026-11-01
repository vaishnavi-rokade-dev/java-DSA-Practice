public class CountLowercaseLetters{
public static void main(String[] args){

String name = "Vaishnavi";
int count = 0;

for(int i =0;i<name.length();i++){
char ch = name.charAt(i);
if(ch >='a' && ch <= 'z'){
count++;
}

}
System.out.println("The lowercase letters in the given number are "+count);
}

}

import java.util.Scanner;
public class UserInPassingString{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
String output = PaString(input);
System.out.println("Hello"+" "+output);
}
static String PaString(Scanner input){
String name = input.next();
return name;
}
}
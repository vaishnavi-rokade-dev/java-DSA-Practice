import java.util.Scanner;
public class StringExample{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the name");
String name = input.next();

String output= myGreet(name);
System.out.println(output);
}
static String myGreet(String name){
String message = "Hello: "+" "+name;
return message;
}

}
//Getting input from user and the output is printed by using the function
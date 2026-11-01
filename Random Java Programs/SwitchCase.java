import java.util.Scanner;
public class SwitchCase{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
String Fruit  = input.next();

switch(Fruit){
case"Apple":
System.out.println("The fruit is red colour");
break;
case"Mango":
System.out.println("The fruit King of fruits");
break;
case"Grapes":
System.out.println("The fruit is small");
break;
case"Orange":
System.out.println("The fruit is rounded");
break;
default:
System.out.println("Enter a valid Fruit");
}
}

}
//Use of Switch Case
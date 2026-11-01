import java.util.Scanner;
public class NestedSwitch{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
String Fruit  = input.next();
String employeeName = "John";
String department = "IT";

switch(employeeName) {
case "John":
System.out.println("Vaishnavi Rokade");
break;
case "Vaishnavi":
System.out.println("Anisha Naikwade");
break;
case "Johni":
switch(department) {
case"IT":
System.out.println("Vaishnavi Rokade");
break;
case"CSE":
System.out.println("Anisha Naikwade");
break;
default:
System.out.println("Enter valid Department");
}
default:
System.out.println("Enter valid EmployeeName");
}
}
}
// In that using only string inputs and case we use both
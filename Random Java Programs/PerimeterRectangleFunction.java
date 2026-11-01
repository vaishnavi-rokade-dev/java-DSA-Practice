import java.util.Scanner;
public class PerimeterRectangleFunction{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
double output = perimeter(input);
System.out.println("The perimeter of rectangle is: "+output);
}

static double perimeter(Scanner input){
System.out.println("The length of rectangle is: ");
double length = input.nextDouble();

System.out.println("The breadth of rectangle is: ");
double breadth = input.nextDouble();

double perimeter = 2*(length+breadth);
return perimeter;
}
}
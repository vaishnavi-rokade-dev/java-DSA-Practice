import java.util.Scanner;
public class AreaCircleFunction{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the radius");

double output = area(input);// function calling with passing the parameters 
System.out.println("The area is: "+ output);
}
static double area(Scanner input){// function creation
int radius = input.nextInt();
double pi= 3.17;
double area = pi*radius*radius;
return area;
}
}
// area of circle with using the function
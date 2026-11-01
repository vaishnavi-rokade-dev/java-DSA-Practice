import java.util.Scanner;
public class AreaTriangleFunction{
public static void main(String [] args){

Scanner input= new Scanner(System.in);

double output = area(input);
System.out.println("The area of the triangle is: "+output);
}
static double area(Scanner input){
System.out.println("Enter the base of Triangle:");
double base = input.nextDouble();
System.out.println("Enter the height of Triangle:");
double height = input.nextDouble();

double area = 0.5*base*height;
return area;
}
}
// These is the area of triangle with creating the functions passing the parameter to the function 
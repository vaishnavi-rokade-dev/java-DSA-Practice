import java.util.Scanner;
public class PerimeterEquiTriaFunction{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double output = perimeter(input);
System.out.println("The perimeter of the Equilateral triangle is: "+output);
}
static double perimeter(Scanner input){
System.out.println("Enter the Side of Equilateral triangle is: ");
double side = input.nextDouble();

double Perimeter = 3*side;
return Perimeter;
}

}
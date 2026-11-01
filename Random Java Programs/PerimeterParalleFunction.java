import java.util.Scanner;
public class PerimeterParalleFunction{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double output = perimeter(input);
System.out.println("The perimeter of parallelogram is: "+output);
}

static double perimeter(Scanner input){
System.out.println("Enter the base of parallelogram: ");
double base = input.nextDouble();
System.out.println("Enter the side of parallelogram: ");
double side = input.nextDouble();

double perimeter = 2*(base+side);
return perimeter;
}
}
// These is the finding perimeter of the parallelogram 
import java.util.Scanner;
public class PerimeterSquareFunction{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double output = perimeter(input);
System.out.println("The perimeter of the square is:"+output);
}
static double perimeter(Scanner input){
System.out.println("Enter the side of square");
double side = input.nextDouble();
double perimeter = 4*side;
return perimeter;
}
}
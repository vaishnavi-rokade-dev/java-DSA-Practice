import java.util.Scanner;
public class AreaRhombusFunction{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
double output = area(input);
System.out.println("The area of rhombus is :"+output);
}
static double area(Scanner input){
System.out.println("Enter the diagonal1 of the rhombus :");
double diagonal1 = input.nextDouble();
System.out.println("Enter the diagonal2 of the rhombus :");
double diagonal2 = input.nextDouble();

double area =0.5 * diagonal1 * diagonal2;
return area;
}
}
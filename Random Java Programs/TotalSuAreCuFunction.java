import java.util.Scanner;
public class TotalSuAreCuFunction{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double output = tosuarcube(input);
System.out.println("The total surface area of the cube is: "+output);

}
static double tosuarcube(Scanner input){
System.out.println("Enter the side of the cube");
double side = input.nextDouble();

double tosuarcube= 6*side*side;
return tosuarcube;

}

}
//6a*a;
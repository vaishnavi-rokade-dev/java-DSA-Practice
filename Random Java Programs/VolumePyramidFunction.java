import java.util.Scanner;
public class VolumePyramidFunction{
public static void main(String [] args){

Scanner input= new Scanner(System.in);

double output = volume(input);
System.out.println("The volume of the triangle is: "+output);
}
static double volume(Scanner input){
System.out.println("Enter the length of Triangle:");
double length = input.nextDouble();
System.out.println("Enter the width of Triangle:");
double width = input.nextDouble();
System.out.println("Enter the height of Triangle:");
double height = input.nextDouble();

double volume = (length*width*height)/3;
return volume;
}
}
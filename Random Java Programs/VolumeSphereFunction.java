import java.util.Scanner;
public class VolumeSphereFunction{
public static void main(String [] args){

Scanner input= new Scanner(System.in);

double output = volume(input);
System.out.println("The volume of the sphere is: "+output);
}
static double volume(Scanner input){
System.out.println("Enter the radius of sphere:");
double radius = input.nextDouble();
double pi = 3.14;

double volume = 1.3333*pi*radius*radius*radius;
return volume;
}
}
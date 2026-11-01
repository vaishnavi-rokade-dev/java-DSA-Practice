import java.util.Scanner;
public class VolumeCylinderFunction{
public static void main(String [] args){

Scanner input= new Scanner(System.in);

double output = volume(input);
System.out.println("The volume of the triangle is: "+output);
}
static double volume(Scanner input){
System.out.println("Enter the radius of Cylinder");
double radius = input.nextDouble();
System.out.println("Enter the height of Cylinder");
double height = input.nextDouble();
double pi = 3.14;

double volume = pi*radius*radius*height;
return volume;

}

}

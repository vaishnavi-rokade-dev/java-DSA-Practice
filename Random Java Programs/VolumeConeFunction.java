import java.util.Scanner;
public class VolumeConeFunction{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
double output = volume(input);
System.out.println("The volume of cone is: "+output);
}
static double volume(Scanner input){
System.out.println("Enter the radius of the cone: ");
double radius = input.nextDouble();
System.out.println("Enter the height of the cone: ");
double height  = input.nextDouble();
double pi = 3.14;
double volume = 0.33*pi*radius*radius*height;
return volume;

}
}
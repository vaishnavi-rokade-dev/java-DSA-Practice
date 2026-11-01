import java.util.Scanner;
public class CurvedSAreCylinderFunction{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double output = curarea(input);
System.out.println("The curved surface area of the cylinder: "+output);

}

static double curarea(Scanner input){

System.out.println("Enter the radius of the cylinder");
double radius = input.nextDouble();
System.out.println("Enter the height of the cylinder");
double height = input.nextDouble();
double pi = 3.14;

double curarea = 2*pi*radius*height;
return curarea;
}

}

//2pirh
import java.util.Scanner;
public class VolumePrismFunction{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double output = volume(input);
System.out.println("The volume of the prism is "+output);
}
static double volume(Scanner input){
System.out.println("Enter the base of the prism");
double base = input.nextDouble();
System.out.println("Enter the height of the prism");
double height = input.nextDouble();

double volume = base*height;
return volume;
}
}



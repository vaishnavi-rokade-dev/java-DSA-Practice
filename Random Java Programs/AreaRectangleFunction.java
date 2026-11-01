import java.util.Scanner;
public class AreaRectangleFunction{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

double output = area(input);
System.out.println("The area of the rectangle is: "+output);
}

static double area(Scanner input){
System.out.println("The length of rectangle is");
double length = input.nextDouble();
System.out.println("The breadth of rectangle is");
double breadth = input.nextDouble();

double area = length*breadth;
return area;
}
}
//Area of parallelogram is same as to these but formula(area = base*height)
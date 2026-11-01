import java.util.Scanner;
public class AreaSquareFunction{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the side of square");


int output = area(input);
System.out.println("The area of square is: "+ output);
}
static int area(Scanner input){
int side = input.nextInt();
int area = 4*side;
return area;
}
}
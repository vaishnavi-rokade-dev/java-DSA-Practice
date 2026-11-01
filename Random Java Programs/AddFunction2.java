import java.util.Scanner;
public class AddFunction2{

public static void main(String[] args){
int ans = sum();
System.out.println("The sum is "+ans);
}

static int sum(){

Scanner input = new Scanner(System.in);
System.out.println("Enter the first number");
int num1 = input.nextInt();
System.out.println("Enter the Second number");
int num2 = input.nextInt();

int sum = num1+num2;
return sum;

}}
//Using the function return the answer is given
import java.util.Scanner;
public class FibonaciiFunction{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int output = fibonacii(input);
System.out.println("The fibonacii series is: "+output);

}
static int fibonacii(Scanner input){
System.out.println("Enter the number: ");
int num = input.nextInt();
int count = 2;
int a = 0;
int b = 1;
System.out.print("Fibonacii series: "+a+" "+b+" ");
while(count<num){
int temp = b;
b=b+a;
a=temp;
count++;
System.out.println(b);
}
return b;
}
}
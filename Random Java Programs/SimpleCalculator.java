import java.util.Scanner;
public class SimpleCalculator{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the first number");
int num1 = input.nextInt();
System.out.println("Enter the second number");
int num2 = input.nextInt();

System.out.println("Enter the operator");

int ans = 0;
while(true){
char op = input.next().trim().charAt(0);
if(op =='+' || op =='-' || op =='*' || op =='/' ||op =='%'){

if(op == '+'){
ans = num1 + num2;
}
if(op == '-'){
ans = num1 - num2;
}
if(op == '*'){
ans = num1 * num2;
}
if(op == '%'){
ans = num1 % num2;
}
if(op == '/'){
if(num2 != 0){
ans = num1 / num2;
}else if(op == 'x' || op == 'X'){
break;
}else{
System.out.println("Enter valid operator");
}

}
}

System.out.println(ans);
}
}}



//some mistakes are remains these program

import java.util.Scanner;
public class AddFunction{

public static void main(String[] args){
sum();
}

static void sum(){

Scanner input = new Scanner(System.in);
System.out.println("Enter the first number");
int num1 = input.nextInt();
System.out.println("Enter the Second number");
int num2 = input.nextInt();

int result = num1+num2;
System.out.println(result);

}


//Using the function we can perform the tasks


}
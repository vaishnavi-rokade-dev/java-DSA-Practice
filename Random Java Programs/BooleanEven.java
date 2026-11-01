import java.util.Scanner;
public class BooleanEven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int num = input.nextInt();
boolean ans = isEven(num);
System.out.println(ans);
}
static boolean isEven(int number){
if(number%2==0){
return true;
}else{
return false;
}
}
}
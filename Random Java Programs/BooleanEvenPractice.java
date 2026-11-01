import java.util.Scanner;
public class BooleanEvenPractice{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the Number");
int num = input.nextInt();
boolean ans = IsEven(num);
System.out.println(ans);
}
static boolean IsEven(int num){
if(num%2==0){
return true;
}else{
return false;
}
}
}
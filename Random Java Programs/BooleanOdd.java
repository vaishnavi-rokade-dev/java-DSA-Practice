import java.util.Scanner;
public class BooleanOdd{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int number = input.nextInt();
boolean ans = IsOdd(number);
System.out.println(ans);
}
static boolean IsOdd(int num){
if(num%2!=0){
return true;
}else{
return false;
}

}
}
import java.util.Scanner;
public class BooleanOddPractice{
public static void main(String[] args){

Scanner input =  new Scanner(System.in);
System.out.println("Enter the number");
int num = input.nextInt();
boolean ans = IsOdd(num);
System.out.println(ans);
}
static boolean IsOdd(int num){
if(num%2 != 0){
return true;
}else{
return false;
}

}
}
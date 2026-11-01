import java.util.Scanner;
public class PrimeBooleanExpression{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int num = input.nextInt();

boolean ans = isPrime(num);
System.out.println(ans);
}
static boolean isPrime(int num){
if(num<=1){
return false;
}
int count = 0;
for(int i=1;i<=num;i++){
if(num%i==0){
count++;
}
}
return count==2;
}
}



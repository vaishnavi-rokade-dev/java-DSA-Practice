import java.util.Scanner;
public class ArmstrongNo{
public static void main(String args[]){
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
//int n = 157;
int result=0;

while(n>0){
int ans = n%10;
result = result+ans*ans*ans;
n = n/10;

}
System.out.println(result);
}

}
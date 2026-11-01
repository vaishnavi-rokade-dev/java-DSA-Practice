import java.util.Scanner;
public class ReverseNumber{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
int num = input.nextInt();
int ans = 0;
int r; 
while(num>0){
r = num % 10;
ans = ans*10+r;
num= num/10;
}
System.out.println(ans);
}}
//Reverse the number 
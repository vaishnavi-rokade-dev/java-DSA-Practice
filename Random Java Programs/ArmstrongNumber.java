import java.util.Scanner;
public class ArmstrongNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int Originalnum = input.nextInt();
int sum = 0;
int r;
int cube;
int temp = Originalnum;

while(temp>0){
r = temp%10;
cube = r*r*r;
sum = sum+cube;
temp =temp/10;
}
if(sum == Originalnum){
System.out.println("The given number is Armstrong number");
}else{
System.out.println("The given number is not Armstrong number");}
}


}
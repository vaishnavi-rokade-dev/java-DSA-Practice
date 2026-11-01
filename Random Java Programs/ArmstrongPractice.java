import java.util.Scanner;
public class ArmstrongPractice{
public static void main(String[] args){

 IsArmstrong();

}
static void IsArmstrong(){
Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
int num = input.nextInt();
int temp = num;
int r;
int cube;
int sum = 0;
while(temp>0){
r=temp%10;
cube=r*r*r;
sum = sum+cube;
temp=temp/10;
}
if(sum==num){
System.out.println("The given number is armstrong number");
}else{
System.out.println("The given number is not armstrong number");
}

}

}
import java.util.Scanner;
public class BooleanArmstrong{
public static void main(String[] args){
Scanner input =  new Scanner(System.in);
System.out.println("Enter the number");
int Originalnum = input.nextInt();
boolean ans = IsArmstrong(Originalnum);
System.out.println(ans);
}
static boolean IsArmstrong(int num){
int r;
int sum = 0;
int CopyOfNum=num;
while(num>0){
r=num % 10;
sum = sum + r*r*r;
num = num/10;
}
if(sum==CopyOfNum){
return true;
}else{
return false;
}
}

}
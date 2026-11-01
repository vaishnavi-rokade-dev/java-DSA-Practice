import java.util.Scanner;
public class NumberOccur{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
int num = input.nextInt();
int count = 0;
int result;
while(num>0){
 result = num % 10;
if(result==7){
count++;
}

num = num /10;
}
System.out.println(count);

}}

//In that program we calculate that how many times 7 occurs in user enterd input
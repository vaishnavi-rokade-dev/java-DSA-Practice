import java.util.Scanner;
public class MaxNumberSimple{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();
int max = 0;
//int a = max;

if(b>max){
max = b;
}else{
max = a;
}
if(c>b){
max = c;
}
System.out.println(max);
}}
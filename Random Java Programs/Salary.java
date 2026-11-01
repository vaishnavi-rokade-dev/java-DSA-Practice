import java.util.Scanner;
public class Salary{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int Salary = input.nextInt();
if(Salary>10000){
 Salary = Salary + 2000;
System.out.println(Salary);
}else{
System.out.println(Salary);
}

}

}
import static java.lang.Math.*;
import java.util.Scanner;
public class UseOfMath{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();

int max = Math.max(c,Math.max(a,b));

System.out.println(max);


}
}
// In these we cannot code again and again we can find out the max number using .Math class
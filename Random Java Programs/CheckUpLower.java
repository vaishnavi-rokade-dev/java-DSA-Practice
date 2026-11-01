import java.util.Scanner;
public class CheckUpLower{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
char ch = input.next().trim().charAt(0);

if(ch>'a' && ch<'z'){

System.out.println("Given Character is in lowercase");
}else{

System.out.println("Given Character is in Uppercase");

}

}

}
//For recognizing the entered character by user is uppercase or lowercase
import java.util.Scanner;
import java.util.*;
public class BasicArray2D{
public static void main(String[] args){

Scanner input = new Scanner(System.in);//Scanner cha object banvnyasathi
System.out.println("Enter the rows of array");
int rows = input.nextInt();
System.out.println("Enter the columns of array");
int columns = input.nextInt();

int[][]arr = new int[rows][columns];
System.out.println("Enter the elements for the 2D array:");

for(int k=0; k<rows; k++){
for(int j=0;j<columns;j++){
//System.out.print("Enter values ["+k +"]["+j+"]:");
arr[k][j]=input.nextInt();
}}
System.out.println("your 2D array:");
for(int k=0; k<rows; k++){
for(int j=0;j<columns;j++){
System.out.print(arr[k][j]+"");

}
System.out.println();
}

}
}

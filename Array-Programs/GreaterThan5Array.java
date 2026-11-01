public class GreaterThan5Array{
public static void main(String[] args){

int[] arr = {5,8,2,10};
int count = 0;

for(int i=0;i<arr.length;i++){
if(arr[i]>5){
count++;
}}
System.out.println(count);
}
}
//Find the number greater than 5
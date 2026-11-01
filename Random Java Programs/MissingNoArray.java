public class MissingNoArray{
public static void main(String[] args){

int arr[] = {1,2,3,5};
int n = 5;

int totalsum = n*(n+1)/2;
int arraysum = 0;
for(int i = 0;i<arr.length;i++){
arraysum = arraysum+arr[i];
}
int missing = totalsum - arraysum;
System.out.println("The missing number is "+missing);
}
}
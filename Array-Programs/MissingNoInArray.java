public class MissingNoInArray{
public static void main(String[] args){
int n =5;
int arr[] = {1,2,4,5};
int arraysum=0;
int totalsum;
int missing;
for(int i = 0;i<arr.length;i++){
arraysum = arraysum+arr[i];

}
totalsum = n*(n+1)/2;
missing = totalsum-arraysum;
System.out.print("The missing number is "+missing);
}

}
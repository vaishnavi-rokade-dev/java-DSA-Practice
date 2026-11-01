import java.util.Arrays;
public class SecondSmallestInArray{
public static void main(String[] args){

int[] arr = {5,8,2,10,1};
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
if(arr[i]<arr[j]){
int temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}

}
}

System.out.println(Arrays.toString(arr));
System.out.println("Second smallest number is " + arr[1]);

}



}
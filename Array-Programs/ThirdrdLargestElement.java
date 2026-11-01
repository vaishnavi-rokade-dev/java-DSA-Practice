import java.util.Arrays;
public class ThirdrdLargestElement{
public static void main(String[] args){

int arr[] = {5,8,2,1};

for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]>arr[j]){

int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}

}
}
System.out.println(Arrays.toString(arr));
System.out.println("Third Largest Element = " + arr[arr.length - 3]);

}
}
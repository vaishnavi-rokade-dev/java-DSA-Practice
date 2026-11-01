import java.util.Arrays;
public class 3rdLargestElement{
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
if(arr[i]<2||arr[j]<4){
System.out.println(arr[i]);
}
}
}
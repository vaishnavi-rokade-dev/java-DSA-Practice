import java.util.Arrays;
public class CheckSortedArray{
public static void main(String[] args){

int[] arr = {1,2,3,4,5};
boolean sorted = false;

for(int i=0;i<arr.length-1;i++){

if(arr[i]>arr[i+1]){
sorted = false;
}else{
sorted = true;
}

}

if(sorted==true){
System.out.println("Array  is already sorted");
}else{
System.out.println("Array  is not sorted");
}

System.out.println(Arrays.toString(arr));
}
}
//Check the array is sorted or not
public class AverageOfArray{
public static void main(String[] args){

int[] arr = {5,8,2,10};
float avg=0;
float sum =0;
for(int i =0;i<arr.length;i++){
sum = sum+arr[i];
}
avg=sum/arr.length;
System.out.println(avg);
}

}
//Average of the Elements in the Array
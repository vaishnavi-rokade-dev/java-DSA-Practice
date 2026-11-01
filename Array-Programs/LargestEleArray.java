public class LargestEleArray{
public static void main(String[] args){

int[] arr = {5,8,2,10};
int max =arr[0];
for(int i =0;i<arr.length;i++){

if(arr[i]>max){
max = arr[i];
}

}
System.out.println(max);
}

}
//finding the largest element in the array
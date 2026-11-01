public class SmallestNoArray{
public static void main(String[] args){

int[] arr = {5,8,2,10};
int min = arr[0];
for(int i=0;i<arr.length;i++){

if(arr[i]<min){
min = arr[i];
}


}
System.out.println(min);
}

}
//Smallest number in array
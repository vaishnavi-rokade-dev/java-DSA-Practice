public class CountOddNumber{
public static void main(String[] args){

int[] arr = {5,8,2,10,7};
int count = 0;

for(int i=0;i<arr.length;i++){

if(arr[i]%2!=0){
count++;
}

}
System.out.println(count);

}


}
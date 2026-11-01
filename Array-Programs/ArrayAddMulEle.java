public class ArrayAddMulEle{
public static void main(String[] args){

int[] arr = {5,8,2,10};

for(int i = 0;i<arr.length;i++){

if(arr[i]%2==0){
arr[i]=arr[i]*2;
System.out.print(arr[i]+",");
}else{
arr[i]=arr[i]+1;
System.out.print(arr[i]+",");
}
}
}
}
//If the number is even multiply it by2 and if the number is odd add 1 in that element
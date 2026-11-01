public class AddSubEleArray{
public static void main(String[] args){

int[] arr = {5,8,2,10};

for(int i=0;i<arr.length;i++){
if(arr[i]>5){
arr[i]=arr[i]-1;
System.out.print(arr[i]+",");
}else{
arr[i]=arr[i]+1;
System.out.print(arr[i]+",");
}

}


}
}
// if number is odd subtract 1 from it and  when number is even add 1 into it
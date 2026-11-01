public class CountTargetedElement{
public static void main(String[] args){

int[] arr = {10,20,30,20,40,20};
int target = 20;
int count = 0;
boolean found=true;
for(int i =0;i<arr.length;i++){

if(target==arr[i]){
count++;
}
}
System.out.println(count);
if(!found){

System.out.println("Given element is not found ");
}
}
}
public class DuplicateEleArray{
public static void main(String[] args){

int[] arr ={10,20,30,20,40,20};
boolean Duplicate = false;

for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]==arr[j]){
Duplicate=true;
}
}
}
if(Duplicate){
System.out.println("Duplicate Found");
}else{
System.out.println("Duplicate not found");
}

}
}
//Finding Duplicate elements is occurs
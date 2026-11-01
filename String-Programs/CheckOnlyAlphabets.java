public class CheckOnlyAlphabets{
public static void main(String args[]){

String name = "Vaishnavi123";
boolean yes = true;

for(int i=0;i<name.length();i++){
char ch = name.charAt(i);
if(!(ch>='A' && ch<='Z'||ch>='a' && ch<='z')){
 
 yes = false;
  break;
}

}
if( yes == true){
System.out.println("Only alphabets");
}else{
System.out.println(" Not Only alphabets");
}

}
}
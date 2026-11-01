public class CheckIfCharacterExist{
public static void main(String[] args){

String name = "Vaishnavi";
boolean found = false;
char target = 'h';

for(int i =0;i<name.length();i++){

if(target == name.charAt(i)){
found = true;
}

}
if(found == true){
System.out.println("h letter is present in given string");
}else{
System.out.println("h letter is not present in given string");
}
}

}
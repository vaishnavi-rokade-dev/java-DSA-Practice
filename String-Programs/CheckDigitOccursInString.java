public class CheckDigitOccursInString{
public static void main(String[] args){

String name = "Vaishnavi1234";
boolean found = false;

for(int i=0;i<name.length();i++){
char ch = name.charAt(i);

if(ch >= '0' &&  ch <= '9'){
found = true;
}

}
 if(found){
            System.out.println("Digit Found");
        }else{
            System.out.println("No Digit Found");
        }
}
}
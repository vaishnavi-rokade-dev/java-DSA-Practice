public class CountAlphabetsCharacterOnly{
public static void main(String[] args){

String name = "Vaishnavirokade@12#";
int count = 0;

for(int i = 0;i<name.length();i++){

char ch = name.charAt(i);
if(ch>='A' && ch<='Z'||ch>='a' && ch<='z'){
count++;
}

}
System.out.println(count);
}



}
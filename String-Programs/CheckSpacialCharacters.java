public class CheckSpacialCharacters{
public static void main(String[] args){

String name = "Vaishnavi@!";
int count = 0;

for(int i=0;i<name.length();i++){
char ch = name.charAt(i);
 if(!((ch>='0'&& ch<='9'||ch>='A'&& ch<='Z')||ch>='a'&& ch<='z')){
  count++;
}

}
System.out.println(count);
}

}
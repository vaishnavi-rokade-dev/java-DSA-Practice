public class RemoveSpaceFromCharacters{
public static void main(String[] args){

String str = "I am Vaishnavi";
String result = "";
for(int i =0;i<str.length();i++){
if(str.charAt(i) != ' '){
result = result+str.charAt(i);
}
}
System.out.println(result);
}



}
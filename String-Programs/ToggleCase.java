public class ToggleCase{
public static void main(String[] args){

String str = "VaiShNAvi";
String result = " ";

for(int i = 0;i<str.length();i++){
char ch = str.charAt(i);
if(ch >= 'A' && ch <= 'Z'){
result = result + (char)(ch + 32);
}
if(ch >= 'a' && ch <= 'z'){
result = result + (char)(ch - 32);

}
}
System.out.println(result);
}



}
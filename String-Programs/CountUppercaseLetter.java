public class CountUppercaseLetter{
public static void main(String[] args){

String name = "VaishnaviABCW";
int count = 0;
for(int i=0;i<name.length();i++){
char ch = name.charAt(i);
if(ch>='A' && ch<='Z'){
count++;
}

}
System.out.println("Uercase letters in give string are "+count);


}
}
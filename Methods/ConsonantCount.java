public class ConsonantCount{

public static int CountConsonant(String word){

int count = 0;

for(int i =0;i<word.length();i++){
char ch = word.charAt(i);
if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
count++;
}
}
return count;
}
public static void main(String[] args){
int result = CountConsonant("Programming");
System.out.println(result);

}

}
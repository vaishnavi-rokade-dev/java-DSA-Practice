
public class CountVowels{

public static int VowelCount(String str){

int count = 0;

for(int i =  0;i<str.length();i++){
char ch = str.charAt(i);

if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
count++;
}

}

return count;
}
public static void main(String[] args){
int result = VowelCount("programming");
System.out.println(result);
}

}
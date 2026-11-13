public class CountCharactersAtOddPosition{
public static void main(String[] args){

String str = "Programming";
int count = 0;
for(int i =1;i<str.length();i=i+2){

count++;
}
System.out.println(count);
}

}
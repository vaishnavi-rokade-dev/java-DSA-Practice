public class VowelsCountName{
public static void main(String[] args){


String name ="Vaishnavi";
int count = 0;

for(int i =0;i<name.length();i++){
char ch = name.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
count++;
}
}
System.out.println(count);
}
}
//Counting vowels  in my name
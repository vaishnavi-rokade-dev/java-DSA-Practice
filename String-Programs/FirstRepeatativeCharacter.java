public class FirstRepeatativeCharacter{
public static void main(String[] args){

String str = "Programming";

for(int i =0;i<str.length();i++){
int count =0;
for(int j=0;j<str.length();j++){

if(str.charAt(i)==str.charAt(j)){
count++;
}

}
if(count >= 2){
System.out.println("First repeatative character is "+str.charAt(i));
break;
}
}

}
}
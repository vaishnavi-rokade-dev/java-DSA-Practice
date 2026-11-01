public class LastNonRepeatedCharacter{
public static void main(String[] args){

String str = "programming";

char LastNonRepeatative = '\0';
for(int i = 0;i<str.length();i++){
int count = 0;
for(int j = 0;j<str.length();j++){

if(str.charAt(i)==str.charAt(j)){
count++;
}

}
if(count<2){
LastNonRepeatative = str.charAt(i);
}
}

System.out.println(LastNonRepeatative);
}
}
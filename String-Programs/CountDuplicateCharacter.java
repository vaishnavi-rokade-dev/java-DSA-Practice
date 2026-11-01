public class CountDuplicateCharacter{
public static void main(String[] args){

String str = "Programming";

for(int i =0;i<str.length();i++){
boolean alreadyPrinted = false;
char ch = str.charAt(i);
for(int k =0;k<i;k++){
 if(str.charAt(k) == str.charAt(i)){
        alreadyPrinted =true;
        break;
    }
}
      if(alreadyPrinted) {
                continue;
            }

            int count = 0;

            for(int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)) {
                    count++;
                }
            }

if(count>1){
System.out.println(str.charAt(i));
}
}
}
}
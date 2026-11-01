public class MostFrequentCharacter{
public static void main(String[] args){

String str = "Banana";
int maxCount = 0;
char maxChar = '\0';
int count = 0;
for(int i=0;i<str.length();i++){

for(int j = 0; j < str.length(); j++){
    if(str.charAt(i) == str.charAt(j)){
        count++;
    }
}
if(count > maxCount){
    maxCount = count;
    maxChar = str.charAt(i);
}
}

System.out.println(maxChar); 

}
}
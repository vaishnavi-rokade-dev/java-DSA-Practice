public class CountMoreThanOneVowel{
public static void main(String[] args){

String str = "Java is an orange elephant";
String[] words = str.split(" ");
int count = 0;
for(int i = 0; i < words.length; i++){

    int vowelCount = 0;

    for(int j = 0; j < words[i].length(); j++){

        char ch = words[i].charAt(j);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vowelCount++;
        }
    }

    if(vowelCount == 1){
        count++;
    }
}
System.out.println(count);
}

}
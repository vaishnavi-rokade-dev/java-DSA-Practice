public class MaxLengthMinWord{
    public static void main(String[] args) {

        String str = "Java is a programming language";
        String[] words = str.split(" ");

        int maxLength = 0;
        int minVowel = 100;

        String answer = "";

        for(int i = 0; i < words.length; i++) {

            int vowelCount = 0;

            for(int j = 0; j < words[i].length(); j++) {

                char ch = words[i].charAt(j);

                if(ch=='a' || ch=='e' || ch=='i' ||
                   ch=='o' || ch=='u') {

                    vowelCount++;
                }
            }

            if(words[i].length() > maxLength) {

                maxLength = words[i].length();
                minVowel = vowelCount;
                answer = words[i];

            }
            else if(words[i].length() == maxLength &&
                    vowelCount < minVowel) {

                minVowel = vowelCount;
                answer = words[i];
            }
        }

        System.out.println(answer);
    }
}
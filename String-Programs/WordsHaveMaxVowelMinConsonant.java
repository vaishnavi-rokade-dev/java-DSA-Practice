public class WordsHaveMaxVowelMinConsonant {
    public static void main(String[] args) {

        String str = "Java queue programming elephant";
        String[] words = str.split(" ");

        int maxVowel = 0;
        int minConsonant = 100;

        String answer = "";

        for(int i = 0; i < words.length; i++) {

            int vowelCount = 0;
            int consonantCount = 0;

            for(int j = 0; j < words[i].length(); j++) {

                char ch = words[i].charAt(j);

                if(ch == 'a' || ch == 'e' || ch == 'i' ||
                   ch == 'o' || ch == 'u') {

                    vowelCount++;

                } else {

                    consonantCount++;
                }
            }

            if(vowelCount > maxVowel) {

                maxVowel = vowelCount;
                minConsonant = consonantCount;
                answer = words[i];

            }
            else if(vowelCount == maxVowel &&
                    consonantCount < minConsonant) {

                minConsonant = consonantCount;
                answer = words[i];
            }
        }

        System.out.println(answer);
    }
}
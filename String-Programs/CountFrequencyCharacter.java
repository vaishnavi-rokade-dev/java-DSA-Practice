public class CountFrequencyCharacter {
    public static void main(String[] args) {

        String str = "programming";

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            boolean alreadyPrinted = false;

            for(int k = 0; k < i; k++) {
                if(str.charAt(k) == ch) {
                    alreadyPrinted = true;
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

            System.out.println(ch + " = " + count);
        }
    }
}
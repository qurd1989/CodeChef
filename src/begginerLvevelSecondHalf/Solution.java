package begginerLvevelSecondHalf;

public class Solution {
     private static final String[] MORSE_LIST = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--..",
            "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."
    };
    private static String morseToEnglish(String morsecode){
        String codes[] = morsecode.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String code : codes) {
            int index = findMorseIndex(code);
            if (index >= 0 && index < 26) {
                sb.append((char) ('a' + index));
            }else if (index >= 26 && index < 36){
                sb.append((char) ('0' + index - 26));
            }

        }
        return sb.toString();
    }

    private static int findMorseIndex(String code){
        for (int i = 0; i < MORSE_LIST.length; i++){
            if (MORSE_LIST[i].equals(code)){
                return i;
            }
        }
        return -1;
    }
}

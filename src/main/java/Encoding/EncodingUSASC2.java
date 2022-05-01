package Encoding;

import java.nio.charset.StandardCharsets;

public class EncodingUSASC2 {

    public static byte[] US_ASC2(String texts) {
        return texts.getBytes(StandardCharsets.US_ASCII);
    }

    public static byte US_ASC2(char word) {
        return US_ASC2(Character.toString(word))[0];
    }

    public static byte[] US_ASC2(char[] words) {
        StringBuilder texts = new StringBuilder();
        for (char word : words) texts.append(word);
        return US_ASC2(String.valueOf(texts));
    }

    public static String US_ASC2(byte[] number) {
        return new String(number, StandardCharsets.US_ASCII);
    }

    public static char US_ASC2(byte number) {
        byte[] bytes = new byte[1];
        bytes[0] = number;
        String text = US_ASC2(bytes);
        return text.charAt(0);
    }

}

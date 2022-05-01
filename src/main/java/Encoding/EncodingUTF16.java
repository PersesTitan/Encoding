package Encoding;

import java.nio.charset.StandardCharsets;

public class EncodingUTF16 {

    public static byte[] UTF16(String texts) {
        return texts.getBytes(StandardCharsets.UTF_16);
    }

    public static byte UTF16(char word) {
        return UTF16(Character.toString(word))[0];
    }

    public static byte[] UTF16(char[] words) {
        StringBuilder texts = new StringBuilder();
        for (char word : words) texts.append(word);
        return UTF16(String.valueOf(texts));
    }

    public static String UTF16(byte[] number) {
        return new String(number, StandardCharsets.UTF_16);
    }

    public static char UTF16(byte number) {
        byte[] bytes = new byte[1];
        bytes[0] = number;
        String text = UTF16(bytes);
        return text.charAt(0);
    }

}

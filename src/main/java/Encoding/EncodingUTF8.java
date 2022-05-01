package Encoding;

import java.io.UTFDataFormatException;
import java.nio.charset.StandardCharsets;

public class EncodingUTF8 {

    public static byte[] UTF8(String texts) {
        return texts.getBytes(StandardCharsets.UTF_8);
    }

    public static byte UTF8(char word) {
        return UTF8(Character.toString(word))[0];
    }

    public static byte[] UTF8(char[] words) {
        StringBuilder texts = new StringBuilder();
        for (char word : words) texts.append(word);
        return UTF8(String.valueOf(texts));
    }

    public static String UTF8(byte[] number) {
        return new String(number, StandardCharsets.UTF_8);
    }

    public static char UTF8(byte number) {
        byte[] bytes = new byte[1];
        bytes[0] = number;
        String text = UTF8(bytes);
        return text.charAt(0);
    }
}

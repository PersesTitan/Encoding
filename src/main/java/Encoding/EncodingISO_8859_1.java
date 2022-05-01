package Encoding;

import java.nio.charset.StandardCharsets;

public class EncodingISO_8859_1 {

    public static byte[] ISO_8859_1(String texts) {
        return texts.getBytes(StandardCharsets.ISO_8859_1);
    }

    public static byte ISO_8859_1(char word) {
        return ISO_8859_1(Character.toString(word))[0];
    }

    public static byte[] ISO_8859_1(char[] words) {
        StringBuilder texts = new StringBuilder();
        for (char word : words) texts.append(word);
        return ISO_8859_1(String.valueOf(texts));
    }

    public static String ISO_8859_1(byte[] number) {
        return new String(number, StandardCharsets.ISO_8859_1);
    }

    public static char ISO_8859_1(byte number) {
        byte[] bytes = new byte[1];
        bytes[0] = number;
        String text = ISO_8859_1(bytes);
        return text.charAt(0);
    }
}

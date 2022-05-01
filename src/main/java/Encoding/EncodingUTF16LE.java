package Encoding;

import java.nio.charset.StandardCharsets;

public class EncodingUTF16LE {

    public static byte[] UTF16LE(String texts) {
        return texts.getBytes(StandardCharsets.UTF_16LE);
    }

    public static byte UTF16LE(char word) {
        return UTF16LE(Character.toString(word))[0];
    }

    public static byte[] UTF16LE(char[] words) {
        StringBuilder texts = new StringBuilder();
        for (char word : words) texts.append(word);
        return UTF16LE(String.valueOf(texts));
    }

    public static String UTF16LE(byte[] number) {
        return new String(number, StandardCharsets.UTF_16LE);
    }

    public static char UTF16LE(byte number) {
        byte[] bytes = new byte[1];
        bytes[0] = number;
         String text = UTF16LE(bytes);
        return text.charAt(0);
    }

}

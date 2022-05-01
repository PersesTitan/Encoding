package Encoding;

import java.nio.charset.StandardCharsets;

public class EncodingUTF16BE {

    public static byte[] UTF16BE(String texts) {
        return texts.getBytes(StandardCharsets.UTF_16BE);
    }

    public static byte UTF16BE(char word) {
        return UTF16BE(Character.toString(word))[0];
    }

    public static byte[] UTF16BE(char[] words) {
        StringBuilder texts = new StringBuilder();
        for (char word : words) texts.append(word);
        return UTF16BE(String.valueOf(texts));
    }

    public static String UTF16BE(byte[] number) {
        return new String(number, StandardCharsets.UTF_16BE);
    }

    public static char UTF16BE(byte number) {
        byte[] bytes = new byte[1];
        bytes[0] = number;
        String text = UTF16BE(bytes);
        return text.charAt(0);
    }

}

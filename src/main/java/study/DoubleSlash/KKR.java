package study.DoubleSlash;

import java.util.Arrays;

public class KKR {
    public static void main(String[] args) {
        String str = "1234567890+-*/";
        char[] strChar = str.toCharArray();
        int count = 0;
        for (int i = 0; i < strChar.length; i++) {
            if (symbol(strChar[i])) {
                count++;
            }
        }
        int[] pos = new int[count];
        int j = 0;
        for (int i = 0; i < strChar.length; i++) {
            if (symbol(strChar[i])) {
                pos[j] = i;
                j++;
            }
        }
        int a = Integer.parseInt(str);
    }

    public static boolean symbol(char a) {
        return a == '+' || a == '-' || a == '*' || a == '/';
    }
}

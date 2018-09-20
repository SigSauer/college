package study.DoubleSlash;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleSlash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Input count of slashes\n/ - one, // - two, etc.");
//        String slashValue = sc.nextLine();
        System.out.println("Input URL");
        String urlValue = sc.nextLine();
        System.out.println(urlValue);
        System.out.println(getQuadrupleSlashURL(urlValue));
//        System.out.println(doubling(urlValue,slashValue));
    }


    public static String getQuadrupleSlashURL(String url) {
        return doubling(url,"\\\\");
    }

    /**
     Next code was written for another program by SigSauer
     */

    private static String doubling(String value, String slash) {
        String newValue;
        char[] oldValue = value.toCharArray();
        System.out.println(value);
        int count = 0;
        for (int i = 0; i < oldValue.length; i++) {
            if (oldValue[i] == '\\') {
                oldValue[i] = '/';
            }
            if (oldValue[i] == '/') {
                count++;
            }
        }
        int[] pos = new int[count];
        int j = 0;
        for (int i = 0; i < oldValue.length; i++) {
            if (oldValue[i] == '/') {
                pos[j] = i;
                j++;
            }
        }
        value = String.valueOf(oldValue);
        System.out.println(value);
        System.out.println("Positions of slashes");
        System.out.println(Arrays.toString(pos));
        String arrayZero = value.substring(0, value.indexOf((int) '/'));
        String arrayLast = value.substring(value.lastIndexOf((int) '/')+1);
        String[] strs = new String[pos.length - 1];
        for (int i = 0; i < strs.length; i++) {
            char[] temp = new char[pos[i + 1] - pos[i] - 1];
            System.arraycopy(oldValue, pos[i] + 1 , temp, 0, temp.length);
            strs[i] = String.valueOf(temp);
            System.out.println(strs[i]);
        }
        //067 434 51 95 - Eko market anastasia
        newValue = arrayZero;
        for (int i = 0; i < strs.length; i++) {
           newValue += (slash + strs[i]);
        }
        newValue+= (slash + arrayLast);
        return newValue;
    }
}

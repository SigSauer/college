package algorithms.session2.hashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Md5Algorithm {

    private static String getHash(String pass) {

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(pass.getBytes());
        byte byteData[] = md.digest();
        StringBuffer hexString = new StringBuffer();
        for (byte aByteData : byteData) {
            String hex = Integer.toHexString(0xff & aByteData);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        String hash = hexString.toString();
        return hash;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string line");
        String str = sc.nextLine();
        System.out.println(getHash(str));
    }
}

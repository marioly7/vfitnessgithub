package bo.ucb.edu.ingsoft.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import static org.apache.tomcat.util.codec.binary.Base64.decodeBase64;
import static org.apache.tomcat.util.codec.binary.Base64.encodeBase64;
import org.apache.commons.codec.binary.Base64;

public class Encrypt {
    private final static String alg = "AES";
    private final static String ci = "AES/CBC/PKCS5Padding";
    private static String key = "92AE31A79FEEB2A3";
    private static String iv =  "0123456789ABCDEF";

    public static String encrypt (String text) throws Exception{
        Cipher cipher = Cipher.getInstance(ci);
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(),alg);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE,skeySpec,ivParameterSpec);
        byte[] encrypted = cipher.doFinal(text.getBytes());

        return new String(encodeBase64(encrypted));
    }

    public static String decrypt (String text) throws Exception{
        Cipher cipher = Cipher.getInstance(ci);
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(),alg);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
        byte[] enc = decodeBase64(text);
        cipher.init(Cipher.DECRYPT_MODE,skeySpec,ivParameterSpec);
        byte[]  decrypted = cipher.doFinal(enc);

        return new String(decrypted,"UTF-8");
    }
}

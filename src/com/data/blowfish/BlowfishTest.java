package com.data.blowfish;

/**
 * @author dk
 * @date 2016/6/30
 */
public class BlowfishTest {
    public static void main(String[] args){
        String keyString = "closewbq";
        String str="1";
        BlowfishUtil crypt = new BlowfishUtil(keyString);
        String tempStr=crypt.encryptString(str);
        System.out.println(tempStr);
        System.out.println(crypt.decryptString(tempStr));
    }
}

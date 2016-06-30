package com.data.blowfish;

/**
 * @author dk
 * @date 2016/6/30
 */
public class BlowfishTest {
    public static void main(String[] args){
        String keyString = "sfasdfdasfdsf, vfdodno.fds*AD:Dsdfsfdaffffff21rw523423423";
        String str="255";

        BlowfishUtil crypt = new BlowfishUtil(keyString);
        String tempStr=crypt.encryptString(str);
        System.out.println(tempStr);
        System.out.println(crypt.decryptString(tempStr));

        String tempStr2=StringEncrypter.encode(str);
        System.out.println(tempStr2);
        System.out.println(StringEncrypter.decode(tempStr2));




    }
}

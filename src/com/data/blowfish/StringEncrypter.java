package com.data.blowfish;

/**
 * @author dk
 * @date 2016/6/30
 */
public class StringEncrypter {
//    private static final Logger logger = Logger.getLogger(StringEncrypter.class);
    private static final String salt = "sfasdfdasfdsf, vfdodno.fds*AD:D";
    private static BlowfishUtil blowfish;

    static {
        blowfish = new BlowfishUtil(salt.substring(32), salt.substring(48, 56));
    }

    /**
     * 加密
     * @param content
     * @return
     */
    public static String encode(String content) {
//        if (StringUtils.isEmpty(content)) {
//            return null;
//        }
        try {
            byte[] encryptedBytes = blowfish.encrypt(content);
            char[] base64Chars = Base64.encode(encryptedBytes);
            int i;
            for (i = 0; i < base64Chars.length; i++) {
                if (base64Chars[i] == '=') {
                    break; // = only appear at end, so i is the ending
                } else if (base64Chars[i] == '+') {
                    base64Chars[i] = '-';
                } else if (base64Chars[i] == '/') {
                    base64Chars[i] = '_';
                }
            }
            return new String(base64Chars, 0, i);
        } catch (Exception e) {
            //logger.error("encode error, content=" + content, e);
        }
        return null;
    }

    /**
     * 解密
     * @param content
     * @return
     */
    public static String decode(String content) {
//        if (StringUtils.isEmpty(content)) {
//            return null;
//        }
        try {
            StringBuilder sb = new StringBuilder(content);
            int i = content.length();
            while (i % 4 != 0) {
                sb.append('=');
                i++;
            }
            for (i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '-') {
                    sb.setCharAt(i, '+');
                } else if (sb.charAt(i) == '_') {
                    sb.setCharAt(i, '/');
                }
            }
            byte[] sourceBytes = Base64.decode(sb.toString());
            return blowfish.decrypt(sourceBytes);
        } catch (Exception e) {
//            logger.error("decode error, content=" + content, e);
        }
        return null;
    }
}

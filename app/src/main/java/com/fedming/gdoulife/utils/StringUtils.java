package com.fedming.gdoulife.utils;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * StringUtils
 *
 * @author fedming
 */

public class StringUtils {

    public StringUtils() {
    }

    public static String URLEncode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            return "";
        }
    }

    public static String URLDecode(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Exception e) {
            return "";
        }
    }

    public static String URLEncodeGB2312(String str) {
        try {
            return URLEncoder.encode(str, "GB2312");
        } catch (Exception e) {
            return "";
        }
    }

    public static String URLDecodeGB2312(String str) {
        try {
            return URLDecoder.decode(str, "GB2312");
        } catch (Exception e) {
            return "";
        }
    }

    public static boolean isFine(String str) {
        return !(str == null || str.trim().length() == 0);
    }

    public static boolean isFine(String str1, String str2) {
        return isFine(str1) && isFine(str2);
    }

    public static boolean isFine(String str1, String str2, String str3) {
        return isFine(str1) && isFine(str2) && isFine(str3);
    }

    public static boolean isFine(String[] str) {
        if (str == null) {
            return false;
        }
        for (String aStr : str) {
            if (!isFine(aStr)) {
                return false;
            }
        }
        return true;
    }

    /**
     * String转32位小写MD5
     */
    public static String parseStrToMd5L32(String str) {
        String reStr = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(str.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bytes) {
                int bt = b & 0xff;
                if (bt < 16) {
                    stringBuffer.append(0);
                }
                stringBuffer.append(Integer.toHexString(bt));
            }
            reStr = stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return reStr;
    }

    /**
     * String转32位大写MD5
     */
    public static String parseStrToMd5U32(String str) {
        String reStr = parseStrToMd5L32(str);
        if (reStr != null) {
            reStr = reStr.toUpperCase();
        }
        return reStr;
    }

    /**
     * String转16位小写MD5
     */
    public static String parseStrToMd5U16(String str) {
        String reStr = parseStrToMd5L32(str);
        if (reStr != null) {
            reStr = reStr.toUpperCase().substring(8, 24);
        }
        return reStr;
    }

    /**
     * String转16位大写MD5
     */
    public static String parseStrToMd5L16(String str) {
        String reStr = parseStrToMd5L32(str);
        if (reStr != null) {
            reStr = reStr.substring(8, 24);
        }
        return reStr;
    }

}
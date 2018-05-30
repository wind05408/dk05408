package com.design.decorator.demo2;

import java.io.*;

/**
 * UpperCaseInputStreamClient
 * IO是java源码里运用的装饰模式
 *
 * @author dk
 * @date 2016/12/7
 */
public class UpperCaseInputStreamClient {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("D://outFile.txt")));
            while ((c= in.read())>0){
                System.out.println((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

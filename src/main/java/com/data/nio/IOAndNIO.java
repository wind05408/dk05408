package com.data.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author dk
 * @date 2016/2/23
 */
public class IOAndNIO {
    public void ioRead(String file) throws IOException {
        long begin = System.currentTimeMillis();
        FileInputStream in = new FileInputStream(file);
        byte[] b = new byte[1024];
        in.read(b);
        System.out.println(new String(b));
        System.out.println("    "+(System.currentTimeMillis()-begin));
    }

    public void nioRead(String file) throws IOException{
        long begin = System.currentTimeMillis();
        FileInputStream in = new FileInputStream(file);
        FileChannel channel = in.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);
        byte[] b = buffer.array();
        System.out.println(new String(b));
        System.out.println("    "+(System.currentTimeMillis()-begin));
    }

    public static void main(String[] args) throws IOException {
        IOAndNIO ioAndNIO = new IOAndNIO();
        ioAndNIO.ioRead("D:\\df.txt");
        System.out.println("------------------------------------------------------");
        ioAndNIO.nioRead("D:\\df.txt");
    }
}

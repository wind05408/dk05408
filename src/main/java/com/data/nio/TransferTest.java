package com.data.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * @author dk
 * @date 2016/2/19
 */
public class TransferTest {
    public static void main(String[] args) throws IOException {
//        RandomAccessFile fromFile = new RandomAccessFile("doc/fromFile.txt", "rw");
//        FileChannel      fromChannel = fromFile.getChannel();
//
//        RandomAccessFile toFile = new RandomAccessFile("doc/toFile.txt", "rw");
//        FileChannel toChannel = toFile.getChannel();
//
//        long position = 0;
//        long count = fromChannel.size();
//
//        toChannel.transferFrom(fromChannel,position, count);


        RandomAccessFile fromFile = new RandomAccessFile("doc/fromFile.txt", "rw");
        FileChannel      fromChannel = fromFile.getChannel();

        RandomAccessFile toFile = new RandomAccessFile("doc/toFile.txt", "rw");
        FileChannel      toChannel = toFile.getChannel();

        long position = 0;
        long count = fromChannel.size();

        fromChannel.transferTo(position, count, toChannel);
    }
}

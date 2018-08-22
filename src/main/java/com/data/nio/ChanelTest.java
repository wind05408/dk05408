package com.data.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

/**
 * @author dk
 * @date 2016/2/18
 */
public class ChanelTest {
    public static void main(String[] args) {
//        RandomAccessFile aFile = new RandomAccessFile("doc/df.txt","rw");
//        FileChannel fileChannel = aFile.getChannel();
//
//        ByteBuffer byteBuffer = ByteBuffer.allocate(48);
//
//        int bytesRead = fileChannel.read(byteBuffer);
//
//        while (bytesRead != -1){
//            System.out.println("Read "+bytesRead);
//            byteBuffer.flip();
//
//            while (byteBuffer.hasRemaining()){
//                System.out.print((char)byteBuffer.get());
//            }
//            byteBuffer.clear();
//            bytesRead = fileChannel.read(byteBuffer);
//        }
//        aFile.close();

        CharBuffer buff = CharBuffer.allocate(8);
        System.out.println("capacity:"+buff.capacity());
        System.out.println("limit:"+buff.limit());
        System.out.println("position:"+buff.position());
        buff.put('a');
        buff.put('b');
        buff.put('c');
        System.out.println("��������Ԫ�غ�,position="+buff.position());
        buff.flip();
        System.out.println("ִ��flip��,limit="+buff.limit());
        System.out.println("position=" + buff.position());
//ȡ����һ��Ԫ��
        System.out.println("��һ��Ԫ��(position=0):" + buff.get());
        System.out.println("ȡ����һ��Ԫ�غ�,position=" + buff.position());
        buff.clear();
        System.out.println("ִ��clear������,limit="+buff.limit());
        System.out.println("ִ��clear������,position="+buff.position());
        System.out.println("ִ��clear��,�����������ݲ�û�б����.������Ԫ��Ϊ:"+buff.get(2));
        System.out.println("ִ�о��Զ�ȡ��,position="+buff.position());
        


    }
}

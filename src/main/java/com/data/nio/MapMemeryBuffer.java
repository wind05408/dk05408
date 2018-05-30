package com.data.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author dk
 * @date 2016/2/22
 */
public class MapMemeryBuffer {
    public static void main(String[] args) throws Exception {

        ByteBuffer byteBuf = ByteBuffer.allocate(1024 * 14 * 1024);

        byte[] bbb = new byte[14 * 1024 * 1024];

        FileInputStream fis = new FileInputStream("d:\\test100.xlsx");

        FileOutputStream fos = new FileOutputStream("d:\\outFile.txt");

        FileChannel fc = fis.getChannel();



        long timeStar = System.currentTimeMillis();//�õ���ǰ��ʱ��

        //fc.read(byteBuf);//1 ��ȡ
        MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());

        long timeEnd = System.currentTimeMillis();//�õ���ǰ��ʱ��

        System.out.println("Read time :" + (timeEnd - timeStar) + "ms");

        timeStar = System.currentTimeMillis();

        mbb.flip();
        //fos.write(bbb);// д��

        timeEnd = System.currentTimeMillis();

        System.out.println("Write time :" + (timeEnd - timeStar) + "ms");

        fos.flush();

        fc.close();

        fis.close();

    }
}

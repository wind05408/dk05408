package com.data.nio;

import java.nio.FloatBuffer;

/**
 * @author dk
 * @date 2016/2/23
 */
public class UseFloatBuffer {
    public static void main(String[] args) {
        FloatBuffer buffer = FloatBuffer.allocate(10);
        for (int i =0;i<buffer.capacity();i++){
            float f = (float) Math.sin((((float) i) / 10) * (2 * Math.PI));
            System.out.println(f);
            buffer.put(f);
        }

        buffer.flip();
        System.out.println("*****************************");
        while (buffer.hasRemaining()){
            float f = buffer.get();
            System.out.println(f);
        }
    }
}

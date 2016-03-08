package com.data.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author dk
 * @date 2016/2/23
 */
public class MultiPortEcho {

    private int[] ports;
    private ByteBuffer echoBuffer = ByteBuffer.allocate(1024);

    public MultiPortEcho(int[] ports) throws IOException {
        this.ports = ports;
        execute();
    }
    public void execute() throws IOException{
        Selector selector = Selector.open();
        for (int i = 0; i < ports.length; i++) {
            ServerSocketChannel ssc = ServerSocketChannel.open();
            //设置此通道为非阻塞模式
            ssc.configureBlocking(false);

            ServerSocket ss =ssc.socket();

            InetSocketAddress address = new InetSocketAddress(ports[i]);
            ss.bind(address);

            ssc.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("Going to listen on " + ports[i]);
        }


        while (true){
            int num = selector.select();

            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iter = selectionKeys.iterator();

            SocketChannel sc;
            while (iter.hasNext()){
                SelectionKey key = iter.next();

                if((key.readyOps()&SelectionKey.OP_ACCEPT) == SelectionKey.OP_ACCEPT){
                    ServerSocketChannel ssc = (ServerSocketChannel) key.channel();

                    sc = ssc.accept();
                    sc.configureBlocking(false);
                    sc.register(selector,SelectionKey.OP_READ);
                    iter.remove();
                    System.out.println("Got connection from " + sc);
                }else if((key.readyOps()&SelectionKey.OP_READ) == SelectionKey.OP_READ){
                    sc = (SocketChannel)key.channel();

                    int bytesEchoed = 0;
                    while (true) {
                        echoBuffer.clear();
                        int r = sc.read(echoBuffer);

                        if (r == -1) {
                            break;
                        }

                        echoBuffer.flip();
                        sc.write(echoBuffer);

                        bytesEchoed += r;
                    }
                    System.out.println("Echoed " + bytesEchoed + " from " + sc);
                    // 删除处理过的选择键
                    iter.remove();

                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        int[] ports = new int[]{8098, 8099};
        new MultiPortEcho(ports);
    }

}

package com.data.nio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author dk
 * @date 2016/3/23
 */
public class NBTest {
    public NBTest() {
    }

    public void startServer() throws IOException {
        int channels = 0;
        int nKeys = 0;
        int currentSelector = 0;

        Selector selector = Selector.open();

        ServerSocketChannel ssc = ServerSocketChannel.open();
        InetSocketAddress address = new InetSocketAddress(InetAddress.getLocalHost(), 8080);
        ssc.socket().bind(address);
        ssc.configureBlocking(false);

        SelectionKey s = ssc.register(selector, SelectionKey.OP_ACCEPT);
        printKeyInfo(s);

        while (true) {
            nKeys = selector.select();
            if (nKeys > 0) {
                debug("NBTest: Number of keys after select operation: " + nKeys);

                Set selectedKeys = selector.selectedKeys();

                Iterator i = selectedKeys.iterator();
                while (i.hasNext()) {
                    s = (SelectionKey) i.next();
                    printKeyInfo(s);
                    debug("NBTest: Nr Keys in selector: " + selector.keys().size());

                    i.remove();

                    if (s.isAcceptable()) {
                        Socket socket = ((ServerSocketChannel) s.channel()).accept().socket();
                        SocketChannel sc = socket.getChannel();
                        sc.configureBlocking(false);
                        sc.register(selector, SelectionKey.OP_READ | SelectionKey.OP_WRITE);
                        debug(++channels + "");
                    } else {
                        debug("NBTest: Channel not acceptable");
                    }
                }
            } else {
                debug("NBTest: Select finished without any keys.");
            }
        }


    }

    private void debug(String s) {
        System.out.println(s);
    }

    private void printKeyInfo(SelectionKey sk) {
        String s = new String();
        s = "Att: " + (sk.attachment() == null ? "no" : "yes");
        s += ", Read: " + sk.isReadable();
        s += ", Acpt: " + sk.isAcceptable();
        s += ", Cnct: " + sk.isConnectable();
        s += ", Wrt: " + sk.isWritable();
        s += ", Valid: " + sk.isValid();
        s += ", Ops: " + sk.interestOps();
        debug(s);
    }

    public static void main(String[] args) {
        NBTest nbTest = new NBTest();
        try {
            nbTest.startServer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

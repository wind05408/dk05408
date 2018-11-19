package com.spi;

import java.util.ServiceLoader;

/**
 * @author: dk05408
 * @date: 2018/11/19 16:53
 * Description:
 */
public class SpiMain {
    public static void main(String[] args) {
        ServiceLoader<SpiService> loader = ServiceLoader.load(SpiService.class);
        for (SpiService service:loader) {
            service.sleep();
        }
    }
}

package cn.alvinkwok.spi_demo;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Demo {
    public static void main(String[] args) {
        ServiceLoader<Cache> phoneServiceLoader = ServiceLoader.load(Cache.class);
        Iterator<Cache> iterator = phoneServiceLoader.iterator();
        while (iterator.hasNext()) {
            Cache impl = iterator.next();
            impl.set("test","test");
        }
    }
}

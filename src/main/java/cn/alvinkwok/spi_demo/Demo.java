package cn.alvinkwok.spi_demo;

import java.util.ServiceLoader;

public class Demo {
    public static void main(String[] args) {
        ServiceLoader<Phone> phoneServiceLoader = ServiceLoader.load(Phone.class);
        phoneServiceLoader.forEach(provider -> {
            String systemInfo = provider.getSystemInfo();
            System.out.println(systemInfo);
        });
    }
}

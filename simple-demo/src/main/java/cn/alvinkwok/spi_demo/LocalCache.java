package cn.alvinkwok.spi_demo;

/**
 * Description
 *
 * @author alvinkwok
 * @since 2022/12/30
 */
public class LocalCache implements Cache {
    @Override
    public String get(String key) {
        System.out.println("正在使用本地缓存");
        return "test";
    }

    @Override
    public boolean set(String key, String value) {
        System.out.println("正在使用本地缓存");
        return true;
    }
}

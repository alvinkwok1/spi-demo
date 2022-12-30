package cn.alvinkwok.spi_demo;

/**
 * Description
 *
 * @author alvinkwok
 * @since ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        CacheService cacheService = CacheService.getInstance();
        cacheService.set("test", "test");
        cacheService.get("test");
    }
}
package cn.alvinkwok.spi_demo;

import cn.alvinkwok.spi_demo.spi.Cache;

import java.util.HashMap;
import java.util.Map;

/**
 * Description
 *
 * @author alvinkwok
 * @since 2022/12/30
 */
public class RedisCache implements Cache {

    private final Map<String, String> cacheMap = new HashMap<>();

    @Override
    public String get(String key) {
        System.out.println("当前缓存服务由Redis提供");
        return cacheMap.get(key);
    }

    @Override
    public boolean set(String key, String value) {
        System.out.println("当前缓存服务由Redis提供");
        cacheMap.put(key, value);
        return true;
    }
}

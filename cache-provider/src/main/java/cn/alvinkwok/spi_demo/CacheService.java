package cn.alvinkwok.spi_demo;

import cn.alvinkwok.spi_demo.spi.Cache;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/**
 * Description
 * 缓存服务
 *
 * @author alvinkwok
 * @since 2022/12/30
 */
public class CacheService {

    private static CacheService impl;

    private final ServiceLoader<Cache> loader;


    private CacheService() {
        loader = ServiceLoader.load(Cache.class);
    }

    public static synchronized CacheService getInstance() {
        if (impl == null) {
            impl = new CacheService();
        }
        return impl;
    }

    public boolean set(String key, String value) {
        try {
            Iterator<Cache> cacheIterator = loader.iterator();
            if (cacheIterator.hasNext()) {
                Cache cache = cacheIterator.next();
                return cache.set(key, value);
            } else {
                System.out.println("没有找到缓存实现");
            }
        } catch (ServiceConfigurationError serviceError) {
            serviceError.printStackTrace();
        }
        return false;
    }


    public String get(String key) {
        try {
            Iterator<Cache> cacheIterator = loader.iterator();
            if (cacheIterator.hasNext()) {
                Cache cache = cacheIterator.next();
                return cache.get(key);
            } else {
                System.out.println("没有找到缓存实现");
            }
        } catch (ServiceConfigurationError serviceError) {
            serviceError.printStackTrace();
        }
        return null;
    }

}

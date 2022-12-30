package cn.alvinkwok.spi_demo;

public interface Cache {
    /**
     * 获取系统信息
     * @return 系统信息
     */
    String get(String key);

    boolean set(String key,String value);
}

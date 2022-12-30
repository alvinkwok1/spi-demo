# spi-demo
对java spi机制的学习

# JAR包运行
1. 先mvn package所有包
2. 执行命令
```shell
# 使用本地缓存的形式
java -cp .\cache-demo\target\cache-demo-1.0.jar;.\cache-provider\target\cache-provider-1.0.jar;.\cache-local\target\cache-local-1.0.jar cn.alvinkwok.spi_demo.Main

# 使用模拟redis的形式
java -cp .\cache-demo\target\cache-demo-1.0.jar;.\cache-provider\target\cache-provider-1.0.jar;.\cache-redis\target\cache-redis-1.0.jar cn.alvinkwok.spi_demo.Main
```

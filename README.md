# databook
主要使用maven 和spring spring mvc dubbo mybatis技术实现分模块开发，注册中心使用zookeeper-3.4.6 这个版本.
> 构建顺序
* 1 构建Parent
* 2 构建Gateway ,该工程中主要提供接口
* 3 构建Underground
* 4 构建facilities 这个主要聚合作用,把所有的模块实现放到一个工程中，方便部署
* 5 构建market 调用service的实现

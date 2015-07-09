# databook
###### 主要使用maven 和spring spring mvc dubbo mybatis技术实现分模块开发，注册中心使用zookeeper-3.4.6 这个版本.
> 构建顺序
* 1 构建Parent
* 2 构建Gateway ,该工程中主要提供接口
* 3 构建Underground
* 4 构建facilities 这个主要聚合作用,把所有的模块实现放到一个工程中，方便部署
* 5 构建market 调用service的实现

>项目运行
* 1 先启动zookeeper 
	如果是windows: 执行D:\Tools\zookeeper-3.4.6\bin  下的zkServer 即可
	<br />如果是linux 执行kServer.sh
* 2 先创建数据 create database biz； 然后把facilities下webapp下的sql文件,导入biz库中，
* 3 打包运行facilities项目 
* 4 运行Market ，输入http://localhost:8080/Market/admin/create.do  插入一条数据到v_amdin表
* 5 输入http://localhost:8080/Market/admin/list.do 观察控制输出如下信息,则成功
>
######
```
id 1admin Admin{username=admin, password=21232f297a57a5a743894a0e4a801fc3, email=845885222@vip.qq.com, name=管理员, department=技术部, isEnabled=true, isLocked=false, loginFailureCount=0, lockedDate=Thu Jul 23 11:22:00 CST 2015, loginDate=Thu Aug 08 23:27:21 CST 2013, loginIp=null}
 $######################displayAdminList
```

>注意
##### <span style="color:blue;">我使用MySQL版本是：5.6.14,开发工具使用的netbeans8.0.2 </span>

项目地址 :A [https://github.com/aboutdata/databook](https://github.com/aboutdata/databook).



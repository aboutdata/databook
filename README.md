# databook
主要使用maven 和spring spring mvc dubbo mybatis技术实现分模块开发，注册中心使用zookeeper-3.4.6 这个版本.
> 构建顺序
* 1 构建Parent
* 2 构建Gateway ,该工程中主要提供接口
* 3 构建Underground
* 4 构建facilities 这个主要聚合作用,把所有的模块实现放到一个工程中，方便部署
* 5 构建market 调用service的实现

>项目运行
* 1 先启动zookeeper 
	如果是windows: 执行D:\Tools\zookeeper-3.4.6\bin  下的zkServer 即可
	如果是linux 执行kServer.sh
* 2 先创建数据 create database biz； 然后把facilities下webapp下的sql文件,导入biz库中，
* 3 打包运行facilities项目 
* 4 运行Market ，输入http://localhost:8080/Market/admin/create.do  插入一条数据到v_amdin表
* 5 输入http://localhost:8080/Market/admin/list.do 观察控制输出如下信息,则成功
>
`
id 1admin Admin{username=admin, password=21232f297a57a5a743894a0e4a801fc3, email=admin@shopxx.net, name=管理员, department=技术部, isEnabled=true, isLocked=false, loginFailureCount=0, lockedDate=Thu Jul 23 11:22:00 CST 2015, loginDate=Thu Aug 08 23:27:21 CST 2013, loginIp=null}
id 2487227710admin Admin{username=51963352, password=40672, email=845885222@qq.com, name=06830, department=计算机, isEnabled=true, isLocked=false, loginFailureCount=0, lockedDate=Thu Jul 09 17:06:39 CST 2015, loginDate=Thu Jul 09 17:06:39 CST 2015, loginIp=2487227710}
id 3136095277admin Admin{username=43938548, password=06058, email=845885222@qq.com, name=95859, department=计算机, isEnabled=true, isLocked=false, loginFailureCount=0, lockedDate=Thu Jul 09 11:21:28 CST 2015, loginDate=Thu Jul 09 11:21:28 CST 2015, loginIp=3136095277}
id 3960790018admin Admin{username=70271398, password=15292, email=845885222@qq.com, name=97567, department=计算机, isEnabled=true, isLocked=false, loginFailureCount=0, lockedDate=Thu Jul 09 14:29:24 CST 2015, loginDate=Thu Jul 09 14:29:24 CST 2015, loginIp=3960790018}
id 5552816345admin Admin{username=32995861, password=56329, email=845885222@qq.com, name=24047, department=计算机, isEnabled=true, isLocked=false, loginFailureCount=-2147483648, lockedDate=Thu Jul 09 10:33:31 CST 2015, loginDate=Thu Jul 09 10:33:31 CST 2015, loginIp=5552816345}
id 8635118941admin Admin{username=21637204, password=16821, email=845885222@qq.com, name=87199, department=计算机, isEnabled=true, isLocked=false, loginFailureCount=0, lockedDate=Thu Jul 09 10:37:38 CST 2015, loginDate=Thu Jul 09 10:37:38 CST 2015, loginIp=8635118941}
$######################displayAdminList
`

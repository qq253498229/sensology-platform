# sensology-platform
######create by ouyang
## 项目结构以及端口规划

####基础模块

|模块          |内容             |端口           |
|--------------|-----------------|---------------|
|eureka-server |服务注册中心     |8761           |
|config-server |服务配置中心     |18888          |
|zuul-server   |服务网关         |17777          |
|manager-server|服务管理         |5000           |
|turbine-server|聚合监控         |7081           |
|zipkin-server |链路追踪         |9411           |

####业务模块

|模块          |内容             |端口           |
|--------------|-----------------|---------------|
|eureka-client |测试配置中心、服务调用、负载均衡     |7074           |
|eureka-client1|                 |7075          |
|eureka-client2|                 |7076          |


## 启动&启动模块顺序

由于本项目配置中心也注册到注册中心管理，所以务必先启动eureka-server，再启动其他服务，
启动顺序如下：

* eureka-server
* config-server
* 其他组件

启动后即可访问。
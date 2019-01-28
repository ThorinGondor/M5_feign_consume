启动feign服务消费者项目后，请访问：http://localhost:9001/feign-consumer
                                   http://localhost:9001/feign-consumer-expand
本节使用了Spring Cloud Feign，相比Ribbon，它只需定义服务绑定接口，即可优雅简单地实现了对服务的调用

注：feign-consumer-expand调用了多个服务，轮询服务时容易出现响应失败，因此可能需要多刷新几次才能获得服务
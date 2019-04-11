package com.cmazxiaoma.serviceapi;

/**
 * @author xiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2019/4/10 23:40
 */
public interface IDubboHelloService {

    String hello();

    void executeServiceException();

    void executeRpcException();
}

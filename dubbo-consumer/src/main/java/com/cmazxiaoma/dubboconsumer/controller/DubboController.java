package com.cmazxiaoma.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcException;
import com.cmazxiaoma.dubbo.common.exception.ServiceException;
import com.cmazxiaoma.serviceapi.IDubboHelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2019/4/10 23:57
 */
@RestController
@RequestMapping("/dubbo")
public class DubboController {

    @Reference(version = "1.0.0")
    private IDubboHelloService dubboHelloService;

    @GetMapping("/hello")
    public String hello() {
        return dubboHelloService.hello();
    }

    @GetMapping("/exception")
    public String exception() {
        try {
            dubboHelloService.executeServiceException();
        } catch (RpcException ex) {
            return "RpcException";
        } catch (ServiceException ex) {
            return "ServiceException";
        } catch (RuntimeException ex) {
            return "RuntimeException";
        } catch (Exception ex) {
            return "Exception";
        }
        return "";
    }
}

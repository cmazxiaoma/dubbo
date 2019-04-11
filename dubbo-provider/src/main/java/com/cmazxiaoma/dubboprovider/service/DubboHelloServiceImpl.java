package com.cmazxiaoma.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.cmazxiaoma.serviceapi.IDubboHelloService;
import org.springframework.stereotype.Component;

/**
 * @author xiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2019/4/10 23:47
 */
@Component
@Service(version = "1.0.0")
public class DubboHelloServiceImpl implements IDubboHelloService {

    @Override
    public String hello() {
        return "hello dubbo";
    }
}

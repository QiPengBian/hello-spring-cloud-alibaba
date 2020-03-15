package com.funtl.spring.cloud.alibaba.consumer.service.fallback;

import com.funtl.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author: QiPeng
 * @version: 1.0.0
 * @description: TODO
 * @createTime: 2020-03-04 23:04:00
 */

@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String string) {
        return "echo fallback";
    }
}

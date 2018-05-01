package com.trickster.springcloudcustomer.service;

import com.trickster.springcloudcustomer.service.fallback.TestServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "spring-cloud-service", fallback = TestServiceFallback.class)
public interface TestService {
    @RequestMapping(value = "/test")
    String test();

}

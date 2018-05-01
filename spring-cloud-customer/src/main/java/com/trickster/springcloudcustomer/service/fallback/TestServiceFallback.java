package com.trickster.springcloudcustomer.service.fallback;

import com.trickster.springcloudcustomer.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestServiceFallback implements TestService {
    @Override
    public String test() {
        return "This is a fallback from customer";
    }
}

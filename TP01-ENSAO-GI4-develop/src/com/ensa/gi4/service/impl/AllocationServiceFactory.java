package com.ensa.gi4.service.impl;

import org.springframework.stereotype.Component;

@Component
public class AllocationServiceFactory {
    public AllocationServiceImpl createInstance(){
        return new AllocationServiceImpl();
    }
}

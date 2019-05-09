package com.sixone.imovie.filmmaker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryProperties;
import org.springframework.cloud.consul.serviceregistry.ConsulAutoServiceRegistration;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class CustomizedEventLinsiners implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    ConsulAutoServiceRegistration consulAutoServiceRegistration;
    @Autowired
    ConsulDiscoveryProperties properties;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        consulAutoServiceRegistration.start();
    }

}

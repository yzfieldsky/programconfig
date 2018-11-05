package com.test.core.config;

import com.test.core.OutputService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.test.core")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

    @Bean()
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public OutputService outputService() {
        OutputService service = new OutputService();
        service.setName("tian");
        return service;
    }

}

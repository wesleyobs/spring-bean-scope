package br.com.selenioexpress.demo.proxy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Student {
    private String name;

    public Student() {
        //test different random names
        this.name = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

}

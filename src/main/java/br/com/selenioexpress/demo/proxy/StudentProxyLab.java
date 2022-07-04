package br.com.selenioexpress.demo.proxy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * The (scope proxy mode == target class) mean that the spring will be generating a coding using
 * the library CGLib(Spring core generation library). This will be performing the capability of inject a new proxy instance of Student class on the fly
 * each time that it be invoked inside another class whose itself scope be singleton
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class StudentProxyLab {
    private String name;

    public StudentProxyLab() {
        //test different random names
        this.name = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

}
